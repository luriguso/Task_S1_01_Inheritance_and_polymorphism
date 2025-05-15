package Nivel1.ejercicio1;

public class wind_instrument extends instrument {
    public wind_instrument(String name, Double price) {
        super(name, price);
    }

    public void play_instrument() {
        System.out.println("A wind instrument is playing");
    }

    static {
        System.out.println("initializing the wind instrument class");
    }
}
