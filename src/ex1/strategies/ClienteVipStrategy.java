package ex1.strategies;

public class ClienteVipStrategy implements DescontoStrategy{

    @Override
    public double calculaDesconto(double valorCompra) {
        return valorCompra * 0.1;
    }
}
