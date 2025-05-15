package Nivel3.ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Editor_management {
    private ArrayList<Editor> editors = new ArrayList();

    public void add_editor(Scanner scanner) {
        System.out.println("Enter the editor's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the editor's DNI: ");
        String dni = scanner.nextLine();
        Editor editor = new Editor(name, dni);
        this.editors.add(editor);
    }

    public void list_editors() {
        System.out.println("List of editors:");
        int i = 0;

        for(Editor editor : this.editors) {
            System.out.println(i + ". " + editor.getName());
            ++i;
        }

    }

    public void remove_editor(Scanner scanner) {
        this.list_editors();
        int index = scanner.nextInt();
        this.editors.remove(index);
        System.out.println("the editor was removed");
    }

    public void submit_news_to_editor(Scanner scanner) {
        New_management new_management = new New_management();
        this.list_editors();
        int index_editor = scanner.nextInt();
        Editor editor = (Editor)this.editors.get(index_editor);
        editor.add_news(new_management.create_news(scanner));
        System.out.println("News added successfully");
    }

    public void remove_news_from_editor(Scanner scanner) {
        System.out.println("Enter the editor's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the headline of the news: ");
        String headline = scanner.nextLine();
        Editor editor_search = null;

        for(Editor editor : this.editors) {
            if (editor.getName().equals(name)) {
                editor_search = editor;
                System.out.println("The editor encontrado");
            }
        }

        if (editor_search != null) {
            int index_news = 0;
            System.out.println("Enter the new editor's headline: ");

            for(News news : editor_search.getNews()) {
                if (news.getHeadline().equals(headline)) {
                    editor_search.getNews().remove(index_news);
                    ++index_news;
                    System.out.println("News removed successfully");
                    break;
                }
            }

            System.out.println("News not found");
        } else {
            System.out.println("The editor does not exist");
        }

    }

    public void show_news_editor() {
        for(Editor editor : this.editors) {
            System.out.println(editor.getName());

            for(News news : editor.getNews()) {
                System.out.println(news.getHeadline());
            }
        }

    }

    public void calculate_news_score() {
        for(Editor editor : this.editors) {
            if (editor.getNews().isEmpty()) {
                System.out.println("There are no registered news items");
            } else {
                for(News news : editor.getNews()) {
                    System.out.println("the news " + news.getHeadline() + " has a puncture of: " + news.calculate_news_score());
                }
            }
        }

    }

    public void calculate_news_price() {
        for(Editor editor : this.editors) {
            if (editor.getNews().isEmpty()) {
                System.out.println("There are no registered news items");
            } else {
                for(News news : editor.getNews()) {
                    System.out.println("the news " + news.getHeadline() + " has a price of: " + news.calculate_price_news() + "$");
                }
            }
        }

    }
}
