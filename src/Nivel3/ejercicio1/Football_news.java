package Nivel3.ejercicio1;

public class Football_news extends News {
    private String competition;
    private String club;
    private String player;
    private static Double starting_price;
    private static int starting_score;

    public Football_news(String headline, String competition, String club, String player) {
        super(headline);
        this.competition = competition;
        this.club = club;
        this.player = player;
        starting_price = (double)300.0F;
        starting_score = 5;
    }

    public Double calculate_price_news() {
        Double final_price = starting_price;
        if (this.competition.equals("Liga de Campeones")) {
            final_price = final_price + (double)100.0F;
        }

        if (this.club.equals("Barça") || this.club.equals("Madrid")) {
            final_price = final_price + (double)100.0F;
        }

        if (this.player.equals("Ferran Torres") || this.player.equals("Benzema")) {
            final_price = final_price + (double)50.0F;
        }

        return final_price;
    }

    public int calculate_news_score() {
        int final_score = starting_score;
        if (this.competition.equals("Liga de Campeones")) {
            final_score += 3;
        } else if (this.competition.equals("Liga")) {
            final_score += 2;
        }

        if (this.club.equals("Barça") || this.club.equals("Madrid")) {
            ++final_score;
        }

        if (this.player.equals("Ferran Torres") || this.player.equals("Benzema")) {
            ++final_score;
        }

        return final_score;
    }
}