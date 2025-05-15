package Nivel3.ejercicio1;

public class Motorcycle_news extends News {
    private String team;
    private static Double starting_price;
    private static int starting_score;

    public Motorcycle_news(String headline, String team) {
        super(headline);
        this.team = team;
        starting_price = (double)100.0F;
        starting_score = 3;
    }

    public Double calculate_price_news() {
        Double final_price = starting_price;
        if (this.team.equals("Honda") || this.team.equals("Yamaha")) {
            final_price = final_price + (double)50.0F;
        }

        return final_price;
    }

    public int calculate_news_score() {
        int final_score = starting_score;
        if (this.team.equals("Honda") || this.team.equals("Yamaha")) {
            final_score += 3;
        }

        return final_score;
    }
}

