public class ExemploWhile {
    public static void main(String[] args) {

        double mesada = 50;
        double valorDoce = 7;
        while (mesada > 0) {

            System.out.println("doce adicionado no carrinho");
            mesada = mesada - valorDoce;
            System.out.println("quanto resta ainda: " + mesada);

            if (mesada < valorDoce) {
                break;
            }

        }
        System.out.println("valor da mesada: " + mesada);
        System.out.println("Acabou a mesada");
    }
}
