package Nivel1.ejercicio2;

public class main {
    public static void main(String[] args) {
        Car nuevo = new Car("Mustang", 200);
        Car.accelerate();
        nuevo.curb();
        System.out.println(nuevo.toString());
    }
}