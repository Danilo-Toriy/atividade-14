package ex2.strategies;

public class CalculaImposto {
    private ImpostoStrategy strategy;

    public void setImpostoStrategy(ImpostoStrategy strategy){
        this.strategy = strategy;
    }

    public double calculaImposto(double valor){
        if (strategy == null){
            System.out.println("Sem estratégia definida");
            return 0;
        }

        return strategy.calculaImposto(valor);
    }
}
