public class ComputadorUsuario {
    public static void main(String[] args) {
        ServicoMensagem smi = null;

        String appEscolhido = "telegram";
        if (appEscolhido.equals("msn"))
        smi = new MSNMensager();
        else if (appEscolhido.equals("telegram"))
        smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
