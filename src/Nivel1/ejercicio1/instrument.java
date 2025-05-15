package Nivel1.ejercicio1;

public abstract class instrument {
    private String name;
    private Double price;

    public instrument(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void play_instrument();

    public String toString() {
        return "instrument{name='" + this.name + '\'' + ", price=" + this.price + '}';
    }
}
