package Nivel1.ejercicio1.classManagement;

import Nivel1.ejercicio1.classData.Instrument;

import java.util.ArrayList;

public class MusicGroup {
    private String name;
    private ArrayList<Instrument> instruments;

    public MusicGroup(String name) {
        this.name = name;
        this.instruments = new ArrayList();
    }

    public void addInstrument(Instrument instrument) {
        this.instruments.add(instrument);
    }

    public String toString() {
        return "music_group{name='" + this.name + '\'' + ", instruments=" + this.instruments + '}';
    }
}
