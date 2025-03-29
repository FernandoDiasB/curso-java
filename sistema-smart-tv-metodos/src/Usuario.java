public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();

        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Status atual da TV: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Status atual da TV: " + smartTv.ligada);

    }
}
