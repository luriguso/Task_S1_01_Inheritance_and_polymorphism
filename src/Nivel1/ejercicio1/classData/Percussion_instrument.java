package Nivel1.ejercicio1.classData;

public class Percussion_instrument extends Instrument {
    public Percussion_instrument(String name, Double price) {
        super(name, price);
    }

    public void play_instrument() {
        System.out.println("A percussion instrument is playing");
    }

    static {
        System.out.println("initializing the percussion instrument class");
    }
}
