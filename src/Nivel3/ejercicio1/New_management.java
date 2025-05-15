package Nivel3.ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class New_management {
    private ArrayList<News> news;

    public void list_news() {
        int i = 0;

        for(News news : this.news) {
            System.out.println(i + " " + news.getHeadline());
            ++i;
        }

    }

    public News get_news(int id) {
        return (News)this.news.get(id);
    }

    public News create_news(Scanner scanner) {
        Menu.menu_news();
        News news1 = null;
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                news1 = this.create_news_football(scanner);
                break;
            case 2:
                news1 = this.create_news_basketball(scanner);
                break;
            case 3:
                news1 = this.create_news_tennis(scanner);
                break;
            case 4:
                news1 = this.create_news_f1(scanner);
                break;
            case 5:
                news1 = this.create_news_motorcycle(scanner);
        }

        return news1;
    }

    private News create_news_football(Scanner scanner) {
        System.out.println("insert the headline: ");
        String headline = scanner.nextLine();
        System.out.println("insert the competition: ");
        String competition = scanner.nextLine();
        System.out.println("insert the club: ");
        String club = scanner.nextLine();
        System.out.println("insert the player: ");
        String player = scanner.nextLine();
        Football_news footballNews = new Football_news(headline, competition, club, player);
        return footballNews;
    }

    private News create_news_basketball(Scanner scanner) {
        System.out.println("insert the headline: ");
        String headline = scanner.nextLine();
        System.out.println("insert the competition: ");
        String competition = scanner.nextLine();
        System.out.println("insert the club: ");
        String club = scanner.nextLine();
        Basketball_news basketballNews = new Basketball_news(headline, competition, club);
        return basketballNews;
    }

    private News create_news_tennis(Scanner scanner) {
        System.out.println("insert the headline: ");
        String headline = scanner.nextLine();
        System.out.println("insert the competition: ");
        String competition = scanner.nextLine();
        System.out.println("insert the player: ");
        String player = scanner.nextLine();
        Tennis_news tennisNews = new Tennis_news(headline, competition, player);
        return tennisNews;
    }

    private News create_news_f1(Scanner scanner) {
        System.out.println("insert the headline: ");
        String headline = scanner.nextLine();
        System.out.println("insert the team: ");
        String team = scanner.nextLine();
        F1_news f1News = new F1_news(headline, team);
        return f1News;
    }

    private News create_news_motorcycle(Scanner scanner) {
        System.out.println("insert the headline: ");
        String headline = scanner.nextLine();
        System.out.println("insert the team: ");
        String team = scanner.nextLine();
        Motorcycle_news motorcycleNews = new Motorcycle_news(headline, team);
        return motorcycleNews;
    }
}
