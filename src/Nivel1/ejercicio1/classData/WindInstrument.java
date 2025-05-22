package Nivel1.ejercicio1.classData;

public class WindInstrument extends Instrument {
    public WindInstrument(String name, Double price) {
        super(name, price);
    }

    public void playInstrument() {
        System.out.println("A wind instrument is playing");
    }

    static {
        System.out.println("initializing the wind instrument class");
    }
}
