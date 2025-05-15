package Nivel1.ejercicio2;

public class Car {
    private static final String brand = "Ford";
    private static String model;
    private final int power;

    public Car(String model, int power) {
        this.power = power;
        Car.model = model;
    }

    public static void accelerate() {
        System.out.println("El vehículo está acelerando");
    }

    public void curb() {
        System.out.println("El vehículo está frenando");
    }

    public String toString() {
        return "Car{brand=Ford\nmodel=" + model + "\npower=" + this.power + '}';
    }
}

