package Nivel1.ejercicio1.classManagement;

import Nivel1.ejercicio1.classData.Instrument;

import java.util.ArrayList;

public class Music_group {
    private String name;
    private ArrayList<Instrument> instruments;

    public Music_group(String name) {
        this.name = name;
        this.instruments = new ArrayList();
    }

    public void add_instrument(Instrument instrument) {
        this.instruments.add(instrument);
    }

    public String toString() {
        return "music_group{name='" + this.name + '\'' + ", instruments=" + this.instruments + '}';
    }
}
