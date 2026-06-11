package ex2.strategies;

public class RioDeJaneiroImpostoStrategy implements ImpostoStrategy{

    @Override
    public double calculaImposto(double valor) {
        return valor * 0.2;
    }
}
