package Nivel2.ejercicio1;

public class phone {
    private String brand;
    private String model;

    public phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void call(String number) {
        System.out.println("Llamando a " + number);
    }
}
