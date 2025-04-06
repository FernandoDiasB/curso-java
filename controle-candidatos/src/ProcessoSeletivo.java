import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
        imprimirSelecionados();
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "fernando", "valentina", "panchito", "baruk", "duque" };
        System.out.println("impressao dos candidatos aprovados com o indice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("o candidato de numero " + (indice + 1) + " é " + candidatos[indice]);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "fernando", "valentina", "panchito", "baruk", "duque", "princesa", "melzinha", "cafu" };
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " selecionou o salário de " + salarioPretendido + " reais");
            if (salarioPretendido <= salarioBase) {
                System.out.println("o candidato " + candidato + " foi selecionado para a proxima fase");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);

    }

    public static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;

        if (salarioPretendido < salarioBase) {
            System.out.println("Ligar para canditato");
        } else if (salarioPretendido > salarioBase) {
            System.out.println("Aguardando resultado dos demais candidatos");
        } else {
            System.out.println("ligar para candidato com contra proposta");
        }
    }
}
