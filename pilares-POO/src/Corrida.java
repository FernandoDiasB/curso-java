public class Corrida {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("34283974");
        jeep.ligar();

        Motoca Neo125 = new Motoca();
        Neo125.setChassi("2653762357");
        // Neo125.ligar();

        Veiculo uno = Neo125;
        uno.ligar();
    }
}
