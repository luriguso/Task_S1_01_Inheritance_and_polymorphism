package Nivel1.ejercicio1;

import java.util.ArrayList;

public class music_group {
    private String name;
    private ArrayList<instrument> instruments;

    public music_group(String name) {
        this.name = name;
        this.instruments = new ArrayList();
    }

    public void add_instrument(instrument instrument) {
        this.instruments.add(instrument);
    }

    public String toString() {
        return "music_group{name='" + this.name + '\'' + ", instruments=" + this.instruments + '}';
    }
}
