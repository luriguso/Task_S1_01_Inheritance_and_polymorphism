package Nivel3.ejercicio1.classManagement;

import Nivel3.ejercicio1.classData.Editor;
import Nivel3.ejercicio1.classData.News;

import java.util.ArrayList;
import java.util.Scanner;

public class EditorManagement {
    private ArrayList<Editor> editors = new ArrayList();

    public void add_editor(Scanner scanner) {
        System.out.println("Enter the editor's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the editor's DNI: ");
        String dni = scanner.nextLine();
        Editor editor = new Editor(name, dni);
        this.editors.add(editor);
    }

    public void listEditors() {
        System.out.println("List of editors:");
        int i = 0;

        for(Editor editor : this.editors) {
            System.out.println(i + ". " + editor.getName());
            ++i;
        }

    }

    public void removeEditor(Scanner scanner) {
        this.listEditors();
        int index = scanner.nextInt();
        this.editors.remove(index);
        System.out.println("the editor was removed");
    }

    public void submitNewsToEditor(Scanner scanner) {
        NewManagement new_management = new NewManagement();
        this.listEditors();
        int indexEditor = scanner.nextInt();
        Editor editor = (Editor)this.editors.get(indexEditor);
        editor.addNews(new_management.createNews(scanner));
        System.out.println("News added successfully");
    }

    public void removeNewsFromEditor(Scanner scanner) {
        System.out.println("Enter the editor's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the headline of the news: ");
        String headline = scanner.nextLine();
        Editor editorSearch = null;

        for(Editor editor : this.editors) {
            if (editor.getName().equals(name)) {
                editorSearch = editor;
                System.out.println("The editor encontrado");
            }
        }

        if (editorSearch != null) {
            int index_news = 0;
            System.out.println("Enter the new editor's headline: ");

            for(News news : editorSearch.getNews()) {
                if (news.getHeadline().equalsIgnoreCase(headline)) {
                    editorSearch.getNews().remove(index_news);
                    ++index_news;
                    System.out.println("News removed successfully");
                    break;
                }
                System.out.println("News not found");
            }
        } else {
            System.out.println("The editor does not exist");
        }

    }

    public void showNewsEditor() {
        for(Editor editor : this.editors) {
            System.out.println(editor.getName());

            for(News news : editor.getNews()) {
                System.out.println(news.getHeadline());
            }
        }
    }

    public void calculateNewsScore() {
        for(Editor editor : this.editors) {
            if (editor.getNews().isEmpty()) {
                System.out.println("There are no registered news items");
            } else {
                for(News news : editor.getNews()) {
                    System.out.println("the news " + news.getHeadline() + " has a puncture of: " + news.calculateNewsScore());
                }
            }
        }

    }

    public void calculateNewsPrice() {
        for(Editor editor : this.editors) {
            if (editor.getNews().isEmpty()) {
                System.out.println("There are no registered news items");
            } else {
                for(News news : editor.getNews()) {
                    System.out.println("the news " + news.getHeadline() + " has a price of: " + news.calculatePriceNews() + "$");
                }
            }
        }
    }
}
