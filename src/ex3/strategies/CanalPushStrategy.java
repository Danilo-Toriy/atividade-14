package ex3.strategies;

public class CanalPushStrategy implements CanalStrategy{

    @Override
    public void enviaMensagem(String mensagem) {
        System.out.println("Canal Escolhido: Push Notification");
    }
}
