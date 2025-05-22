package Nivel2.ejercicio1.main;

import Nivel2.ejercicio1.classData.Smartphone;

public class main {
    public static void main(String[] args) {
        Smartphone movil = new Smartphone("Samsung", "S22 Ultra");
        movil.call("");
        movil.alarm();
        movil.photograph();
    }
}
