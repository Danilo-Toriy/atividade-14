package ex3.strategies;

public class DefineCanal {
    private CanalStrategy strategy;

    public void setCanalStrategy(CanalStrategy strategy){
        this.strategy = strategy;
    }

    public void defineCanalDeEnvio(String mensagem){
        if(this.strategy == null){
            System.out.println("Sem estratégia definida");
            return;
        }

        strategy.enviaMensagem(mensagem);
    }
}
