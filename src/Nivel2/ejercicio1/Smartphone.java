package Nivel2.ejercicio1;

public class Smartphone extends phone implements Camera, Clock {
    public Smartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    public void photograph() {
        System.out.println("Se está haciendo una foto");
    }

    public void alarm() {
        System.out.println("Está sonando la alarma");
    }
}