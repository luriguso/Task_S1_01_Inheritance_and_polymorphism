package Nivel1.ejercicio1.main;

import Nivel1.ejercicio1.classData.Percussion_instrument;
import Nivel1.ejercicio1.classData.Stringed_instrument;
import Nivel1.ejercicio1.classData.Wind_instrument;
import Nivel1.ejercicio1.classManagement.Music_group;

public class main {
    public static void main(String[] args) {
        Music_group grupo1 = new Music_group("grupomusical");
        Wind_instrument IV_1 = new Wind_instrument("Flauta", 20.1);
        new Wind_instrument("Trompeta", 20.1);
        Stringed_instrument IC_1 = new Stringed_instrument("Guitarra", 20.1);
        new Stringed_instrument("Violin", 20.1);
        Percussion_instrument IP_1 = new Percussion_instrument("Tambor", 20.1);
        new Percussion_instrument("Bombo", 20.1);
        grupo1.add_instrument(IV_1);
        grupo1.add_instrument(IC_1);
        grupo1.add_instrument(IP_1);
        System.out.println(grupo1.toString());
        IV_1.play_instrument();
        IC_1.play_instrument();
        IP_1.play_instrument();
    }
}