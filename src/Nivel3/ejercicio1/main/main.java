package Nivel3.ejercicio1.main;

import Nivel3.ejercicio1.classData.Menu;
import Nivel3.ejercicio1.classManagement.EditorManagement;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EditorManagement editorManagement = new EditorManagement();
        boolean process = true;

        while(process) {
            Menu.menu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    editorManagement.add_editor(sc);
                    break;
                case 2:
                    editorManagement.removeEditor(sc);
                    break;
                case 3:
                    editorManagement.submitNewsToEditor(sc);
                    break;
                case 4:
                    editorManagement.removeNewsFromEditor(sc);
                    break;
                case 5:
                    editorManagement.showNewsEditor();
                    break;
                case 6:
                    editorManagement.calculateNewsScore();
                    break;
                case 7:
                    editorManagement.calculateNewsPrice();
                    break;
                case 8:
                    process = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
