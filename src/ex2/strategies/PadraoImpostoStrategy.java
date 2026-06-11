package ex2.strategies;

public class PadraoImpostoStrategy implements ImpostoStrategy{

    @Override
    public double calculaImposto(double valor) {
        return valor * 0.1;
    }
}
