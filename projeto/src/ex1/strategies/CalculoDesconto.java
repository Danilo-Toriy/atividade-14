package ex1.strategies;

public class CalculoDesconto {

    private DescontoStrategy strategy;

    public void setDescontoStrategy(DescontoStrategy strategy){
        this.strategy = strategy;
    }

    public double executarCalculo(double valorCompra){
        if(this.strategy == null){
            System.out.println("Sem estratégia definida");
            return 0;
        }

        return strategy.calculaDesconto(valorCompra);
    }
}
