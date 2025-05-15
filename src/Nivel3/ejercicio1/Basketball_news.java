package Nivel3.ejercicio1;

public class Basketball_news extends News {
    private String competition;
    private String club;
    private static Double starting_price;
    private static int starting_score;

    public Basketball_news(String headline, String competition, String club) {
        super(headline);
        this.competition = competition;
        this.club = club;
        starting_price = (double)250.0F;
        starting_score = 4;
    }

    public Double calculate_price_news() {
        Double final_price = starting_price;
        if (this.competition.equals("Euroliga")) {
            final_price = final_price + (double)75.0F;
        }

        if (this.club.equals("Barça") || this.club.equals("Madrid")) {
            final_price = final_price + (double)75.0F;
        }

        return final_price;
    }

    public int calculate_news_score() {
        int final_score = starting_score;
        if (this.competition.equals("Euroliga")) {
            final_score += 3;
        } else if (this.competition.equals("ABC")) {
            final_score += 2;
        }

        if (this.club.equals("Barça") || this.club.equals("Madrid")) {
            ++final_score;
        }

        return final_score;
    }
}
