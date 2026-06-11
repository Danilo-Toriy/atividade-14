package ex3.strategies;

public class CanalWhatsappStrategy implements CanalStrategy{

    @Override
    public void enviaMensagem(String mensagem) {
        System.out.println("Canal Escolhido: WhatsApp");
    }
}
