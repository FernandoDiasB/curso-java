public class Telegram extends ServicoMensagem{

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando Msnsagem Telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem Telegram");
    }

}
