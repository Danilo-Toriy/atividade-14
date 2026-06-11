package ex6.strategies;

public class ConfiguracaoDesconto {
    private static ConfiguracaoDesconto instance;

    private double limiteDescontoMaximo;

    public ConfiguracaoDesconto() {
        this.limiteDescontoMaximo = 0.5;
    }

    public static ConfiguracaoDesconto getInstance() {
        if (instance == null) {
            instance = new ConfiguracaoDesconto();
        }
        return instance;
    }

    public double getLimiteDescontoMaximo() {
        return limiteDescontoMaximo;
    }

    public void setLimiteDescontoMaximo(double limiteDescontoMaximo) {
        this.limiteDescontoMaximo = limiteDescontoMaximo;
    }
}
