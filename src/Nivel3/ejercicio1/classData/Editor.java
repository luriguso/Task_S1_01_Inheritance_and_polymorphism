package Nivel3.ejercicio1.classData;

import java.util.ArrayList;

public class Editor {
    private String name;
    private final String DNI;
    private static Double salary;
    private ArrayList<News> news;

    public Editor(String name, String dni) {
        this.name = name;
        this.DNI = dni;
        salary = (double)1500.0F;
        this.news = new ArrayList();
    }

    public String getName() {
        return this.name;
    }

    public String getDNI() {
        return this.DNI;
    }

    public static Double getSalary() {
        return salary;
    }

    public ArrayList<News> getNews() {
        return this.news;
    }

    public void increaseSalary(Double salary) {
        Editor.salary = salary;
    }

    public void addNews(News news) {
        this.news.add(news);
    }

    public String toString() {
        return "Editor{name='" + this.name + '\'' + ", dni='" + this.DNI + '\'' + ", news=" + this.news + '}';
    }
}
