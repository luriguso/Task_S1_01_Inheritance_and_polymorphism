package Nivel1.ejercicio1.classData;

public abstract class Instrument {
    private String name;
    private Double price;

    public Instrument(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void playInstrument();

    public String toString() {
        return "instrument{name='" + this.name + '\'' + ", price=" + this.price + '}';
    }
}
