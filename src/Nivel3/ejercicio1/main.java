package Nivel3.ejercicio1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Editor_management editorManagement = new Editor_management();
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
                    editorManagement.remove_editor(sc);
                    break;
                case 3:
                    editorManagement.submit_news_to_editor(sc);
                    break;
                case 4:
                    editorManagement.remove_news_from_editor(sc);
                    break;
                case 5:
                    editorManagement.show_news_editor();
                    break;
                case 6:
                    editorManagement.calculate_news_score();
                    break;
                case 7:
                    editorManagement.calculate_news_price();
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
