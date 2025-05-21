package Nivel1.ejercicio1.classData;

public class Stringed_instrument extends Instrument {
    public Stringed_instrument(String name, Double price) {
        super(name, price);
    }

    public void play_instrument() {
        System.out.println("A string instrument is playing");
    }

    static {
        System.out.println("initializing the stringed instrument class");
    }
}

