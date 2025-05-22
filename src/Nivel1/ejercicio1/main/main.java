package Nivel1.ejercicio1.main;

import Nivel1.ejercicio1.classData.PercussionInstrument;
import Nivel1.ejercicio1.classData.StringedInstrument;
import Nivel1.ejercicio1.classData.WindInstrument;
import Nivel1.ejercicio1.classManagement.MusicGroup;

public class main {
    public static void main(String[] args) {
        MusicGroup grupo1 = new MusicGroup("grupomusical");
        WindInstrument IV_1 = new WindInstrument("Flauta", 20.1);
        new WindInstrument("Trompeta", 20.1);
        StringedInstrument IC_1 = new StringedInstrument("Guitarra", 20.1);
        new StringedInstrument("Violin", 20.1);
        PercussionInstrument IP_1 = new PercussionInstrument("Tambor", 20.1);
        new PercussionInstrument("Bombo", 20.1);
        grupo1.addInstrument(IV_1);
        grupo1.addInstrument(IC_1);
        grupo1.addInstrument(IP_1);
        System.out.println(grupo1.toString());
        IV_1.playInstrument();
        IC_1.playInstrument();
        IP_1.playInstrument();
    }
}