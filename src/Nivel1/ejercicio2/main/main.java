package Nivel1.ejercicio2.main;

import Nivel1.ejercicio2.classData.Car;

public class main {
    public static void main(String[] args) {
        Car newCar = new Car("Mustang", 200);
        Car.accelerate();
        newCar.curb();
        System.out.println(newCar.toString());
    }
}