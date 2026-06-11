package ex3.strategies;

public class CanalEmailStrategy implements CanalStrategy {

    @Override
    public void enviaMensagem(String mensagem) {
        System.out.println("Canal Escolhido: E-mail");
    }
}
