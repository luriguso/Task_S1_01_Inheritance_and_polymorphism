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
        if(this.editors.isEmpty()) {
            System.out.println("There are no editors to remove");
            return;
        }

        this.listEditors();
        System.out.println("Select an editor: ");
        int index = scanner.nextInt();

        this.editors.remove(index);
        System.out.println("the editor was removed");
    }

    public void submitNewsToEditor(Scanner scanner) {
        if(this.editors.isEmpty()) {
            System.out.println("There are no editors to add news");
            return;
        }
        NewManagement new_management = new NewManagement();
        this.listEditors();
        int indexEditor = scanner.nextInt();
        Editor editor = (Editor)this.editors.get(indexEditor);
        editor.addNews(new_management.createNews(scanner));
        System.out.println("News added successfully");
    }

    public void removeNewsFromEditor(Scanner scanner) {
        if(this.editors.isEmpty()) {
            System.out.println("There are no editors to remove");
            return;
        }
        System.out.println("Enter the editor's name: ");
        String name = scanner.nextLine();
        Editor editorSearch = null;

        for(Editor editor : this.editors) {
            if (editor.getName().equals(name)) {
                editorSearch = editor;
                System.out.println("The editor found");
            }
        }

        if (editorSearch != null) {
            if(editorSearch.getNews().isEmpty()) {
                System.out.println("The editor dont have any news");
                return;
            }
            int index_news = 0;
            System.out.println("Enter the headline of the news: ");
            String headline = scanner.nextLine();

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
            System.out.println("The editor " + name + " does not exist");
        }

    }

    public void showNewsEditor() {
        if(this.editors.isEmpty()) {
            System.out.println("There are no editors to show");
            return;
        }
        for(Editor editor : this.editors) {
            System.out.println("Edito: " + editor.getName());
            System.out.println("News: ");
            if(!editor.getNews().isEmpty()) {
                for(News news : editor.getNews()) {
                    System.out.println("    *"+news.getHeadline());
                }
            }else {
                System.out.println("No news found");
            }
        }
    }

    public void calculateNewsScore() {
        if(this.editors.isEmpty()) {
            System.out.println("There are no registered editors");
            return;
        }
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
        if(this.editors.isEmpty()) {
            System.out.println("There are no registered editors");
            return;
        }
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
