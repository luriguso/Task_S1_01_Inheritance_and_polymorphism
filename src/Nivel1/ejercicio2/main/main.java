package Nivel1.ejercicio2.main;

import Nivel1.ejercicio2.classData.Car;

public class main {
    public static void main(String[] args) {
        Car nuevo = new Car("Mustang", 200);
        Car.accelerate();
        nuevo.curb();
        System.out.println(nuevo.toString());
    }
}