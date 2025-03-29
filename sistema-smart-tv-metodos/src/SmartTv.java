public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 0;

    public void aumentarVolume() {
        volume++;
    }

    public void abaixarVolume() {
        volume--;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

}