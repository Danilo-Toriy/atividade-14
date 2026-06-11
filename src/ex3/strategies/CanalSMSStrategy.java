package ex3.strategies;

public class CanalSMSStrategy implements CanalStrategy{

    @Override
    public void enviaMensagem(String mensagem) {
        System.out.println("Canal Escolhido: SMS");
    }
}
