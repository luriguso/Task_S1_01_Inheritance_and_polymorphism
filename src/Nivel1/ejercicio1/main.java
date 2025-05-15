package Nivel1.ejercicio1;

public class main {
    public static void main(String[] args) {
        music_group grupo1 = new music_group("grupomusical");
        wind_instrument IV_1 = new wind_instrument("Flauta", 20.1);
        new wind_instrument("Trompeta", 20.1);
        stringed_instrument IC_1 = new stringed_instrument("Guitarra", 20.1);
        new stringed_instrument("Violin", 20.1);
        percussion_instrument IP_1 = new percussion_instrument("Tambor", 20.1);
        new percussion_instrument("Bombo", 20.1);
        grupo1.add_instrument(IV_1);
        grupo1.add_instrument(IC_1);
        grupo1.add_instrument(IP_1);
        System.out.println(grupo1.toString());
        IV_1.play_instrument();
        IC_1.play_instrument();
        IP_1.play_instrument();
    }
}