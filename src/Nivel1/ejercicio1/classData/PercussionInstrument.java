package Nivel1.ejercicio1.classData;

public class PercussionInstrument extends Instrument {
    public PercussionInstrument(String name, Double price) {
        super(name, price);
    }

    public void playInstrument() {
        System.out.println("A percussion instrument is playing");
    }

    static {
        System.out.println("initializing the percussion instrument class");
    }
}
