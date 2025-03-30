public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 15;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println(saldo);

        } else {
            System.out.println(saldo);
        }

    }

}