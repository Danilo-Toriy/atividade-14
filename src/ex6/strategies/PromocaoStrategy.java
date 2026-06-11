package ex6.strategies;

public class PromocaoStrategy implements DescontoStrategy {

    @Override
    public double calculaDesconto(double valorCompra) {
        return valorCompra * 0.2;
    }
}
