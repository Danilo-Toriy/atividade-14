package ex1.strategies;

public class ClienteComumStrategy implements DescontoStrategy{

    @Override
    public double calculaDesconto(double valorCompra) {
        return valorCompra * 0.05;
    }
}
