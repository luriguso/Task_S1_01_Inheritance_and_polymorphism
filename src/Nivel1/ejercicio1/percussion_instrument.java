package Nivel1.ejercicio1;

public class percussion_instrument extends instrument {
    public percussion_instrument(String name, Double price) {
        super(name, price);
    }

    public void play_instrument() {
        System.out.println("A percussion instrument is playing");
    }

    static {
        System.out.println("initializing the percussion instrument class");
    }
}
