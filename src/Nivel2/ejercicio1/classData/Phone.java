package Nivel2.ejercicio1.classData;

public class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void call(String number) {
        if(number == null || number.isEmpty()) {
            System.out.println("The phone number is null or empty");
            return;
        }

        System.out.println("Calling " + number);
    }
}
