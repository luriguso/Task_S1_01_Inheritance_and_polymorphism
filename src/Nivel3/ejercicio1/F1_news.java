package Nivel3.ejercicio1;

public class F1_news extends News {
    private String team;
    private static Double starting_price;
    private static int starting_score;

    public F1_news(String headline, String team) {
        super(headline);
        this.team = team;
        starting_price = (double)100.0F;
        starting_score = 4;
    }

    public Double calculate_price_news() {
        Double final_price = starting_price;
        if (this.team.equals("Ferrari") || this.team.equals("Mercedes")) {
            final_price = final_price + (double)50.0F;
        }

        return final_price;
    }

    public int calculate_news_score() {
        int final_score = starting_score;
        if (this.team.equals("Ferrari") || this.team.equals("Mercedes")) {
            final_score += 2;
        }

        return final_score;
    }
}
