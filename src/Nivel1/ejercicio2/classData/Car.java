package Nivel1.ejercicio2.classData;

public class Car {
    private static final String BRAND = "Ford";
    private static String model;
    private final int POWER;

    public Car(String model, int power) {
        this.POWER = power;
        Car.model = model;
    }

    public static void accelerate() {
        System.out.println("The vehicle is accelerating");
    }

    public void curb() {
        System.out.println("The vehicle is braking");
    }

    public String toString() {
        return "Car{brand=Ford\nmodel=" + model + "\npower=" + this.POWER + '}';
    }
}

