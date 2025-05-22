package Nivel1.ejercicio1.classData;

public class StringedInstrument extends Instrument {
    public StringedInstrument(String name, Double price) {
        super(name, price);
    }

    public void playInstrument() {
        System.out.println("A string instrument is playing");
    }

    static {
        System.out.println("initializing the stringed instrument class");
    }
}

