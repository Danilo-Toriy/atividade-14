package ex6.strategies;

public class CalculoDesconto {

    private DescontoStrategy strategy;

    public void setDescontoStrategy(DescontoStrategy strategy){
        this.strategy = strategy;
    }

    public double executarCalculo(double valorCompra){
        if (this.strategy == null) {
            System.out.println("Sem estratégia definida");
            return 0;
        }

        double limiteDescontoMaximo = ConfiguracaoDesconto.getInstance().getLimiteDescontoMaximo();
        double descontoCalculado = strategy.calculaDesconto(valorCompra);

        return Math.min(descontoCalculado, limiteDescontoMaximo);
    }


}
