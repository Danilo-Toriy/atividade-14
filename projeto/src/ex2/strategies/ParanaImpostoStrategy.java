package ex2.strategies;

public class ParanaImpostoStrategy implements ImpostoStrategy{

    @Override
    public double calculaImposto(double valor) {
        return valor * 0.12;
    }
}
