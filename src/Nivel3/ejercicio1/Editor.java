package Nivel3.ejercicio1;

import java.util.ArrayList;

public class Editor {
    private String name;
    private final String dni;
    private static Double salary;
    private ArrayList<News> news;

    public Editor(String name, String dni) {
        this.name = name;
        this.dni = dni;
        salary = (double)1500.0F;
        this.news = new ArrayList();
    }

    public String getName() {
        return this.name;
    }

    public String getDni() {
        return this.dni;
    }

    public static Double getSalary() {
        return salary;
    }

    public ArrayList<News> getNews() {
        return this.news;
    }

    public void increase_salary(Double salary) {
        Editor.salary = salary;
    }

    public void add_news(News news) {
        this.news.add(news);
    }

    public String toString() {
        return "Editor{name='" + this.name + '\'' + ", dni='" + this.dni + '\'' + ", news=" + this.news + '}';
    }
}
