package Nivel3.ejercicio1.classManagement;

import Nivel3.ejercicio1.classData.*;

import java.util.Scanner;

public class NewManagement {
    public News createNews(Scanner scanner) {
        Menu.menuNews();
        News news1 = null;
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                news1 = this.createNewsFootball(scanner);
                break;
            case 2:
                news1 = this.createNewsBasketball(scanner);
                break;
            case 3:
                news1 = this.createNewsTennis(scanner);
                break;
            case 4:
                news1 = this.createNewsF1(scanner);
                break;
            case 5:
                news1 = this.createNewsMotorcycle(scanner);
        }

        return news1;
    }

    private News createNewsFootball(Scanner scanner) {
        System.out.println("insert the headline: ");
        String headline = scanner.nextLine();
        System.out.println("insert the competition: ");
        String competition = scanner.nextLine();
        System.out.println("insert the club: ");
        String club = scanner.nextLine();
        System.out.println("insert the player: ");
        String player = scanner.nextLine();
        FootballNews footballNews = new FootballNews(headline, competition, club, player);
        return footballNews;
    }

    private News createNewsBasketball(Scanner scanner) {
        System.out.println("insert the headline: ");
        String headline = scanner.nextLine();
        System.out.println("insert the competition: ");
        String competition = scanner.nextLine();
        System.out.println("insert the club: ");
        String club = scanner.nextLine();
        BasketballNews basketballNews = new BasketballNews(headline, competition, club);
        return basketballNews;
    }

    private News createNewsTennis(Scanner scanner) {
        System.out.println("insert the headline: ");
        String headline = scanner.nextLine();
        System.out.println("insert the competition: ");
        String competition = scanner.nextLine();
        System.out.println("insert the player: ");
        String player = scanner.nextLine();
        TennisNews tennisNews = new TennisNews(headline, competition, player);
        return tennisNews;
    }

    private News createNewsF1(Scanner scanner) {
        System.out.println("insert the headline: ");
        String headline = scanner.nextLine();
        System.out.println("insert the team: ");
        String team = scanner.nextLine();
        F1News f1News = new F1News(headline, team);
        return f1News;
    }

    private News createNewsMotorcycle(Scanner scanner) {
        System.out.println("insert the headline: ");
        String headline = scanner.nextLine();
        System.out.println("insert the team: ");
        String team = scanner.nextLine();
        MotorcycleNews motorcycleNews = new MotorcycleNews(headline, team);
        return motorcycleNews;
    }
}
