package Nivel2.ejercicio1.classData;

import Nivel2.ejercicio1.interfaces.Camera;
import Nivel2.ejercicio1.interfaces.Clock;

public class Smartphone extends Phone implements Camera, Clock {
    public Smartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    public void photograph() {
        System.out.println("He is taking a photo");
    }

    public void alarm() {
        System.out.println("The alarm is ringing");
    }
}