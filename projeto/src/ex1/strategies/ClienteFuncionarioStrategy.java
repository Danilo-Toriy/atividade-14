package ex1.strategies;

public class ClienteFuncionarioStrategy implements DescontoStrategy{

    @Override
    public double calculaDesconto(double valorCompra) {
        return valorCompra * 0.2;
    }
}
