package ex2.strategies;

public class SaoPauloImpostoStrategy implements ImpostoStrategy{

    @Override
    public double calculaImposto(double valor) {
        return valor * 0.18;
    }
}
