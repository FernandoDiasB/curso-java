import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("digite sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("E tenho " + altura + " de altura");

    }
}
