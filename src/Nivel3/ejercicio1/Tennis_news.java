package Nivel3.ejercicio1;

public class Tennis_news extends News {
    private String competition;
    private String player;
    private static Double starting_price;
    private static int starting_score;

    public Tennis_news(String headline, String competition, String player) {
        super(headline);
        this.competition = competition;
        this.player = player;
        starting_price = (double)150.0F;
        starting_score = 4;
    }

    public Double calculate_price_news() {
        Double final_price = starting_price;
        if (this.player.equals("Federer") || this.player.equals("Nadal") || this.player.equals("Djokovic")) {
            final_price = final_price + (double)100.0F;
        }

        return final_price;
    }

    public int calculate_news_score() {
        int final_score = starting_score;
        if (this.player.equals("Federer") || this.player.equals("Nadal") || this.player.equals("Djokovic")) {
            final_score += 3;
        }

        return final_score;
    }
}
