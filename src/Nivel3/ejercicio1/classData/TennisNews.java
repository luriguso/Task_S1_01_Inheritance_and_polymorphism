package Nivel3.ejercicio1.classData;

import java.math.BigDecimal;

public class TennisNews extends News {
    private String competition;
    private String player;
    private static BigDecimal startingPrice;
    private static int startingScore;

    public TennisNews(String headline, String competition, String player) {
        super(headline);
        this.competition = competition;
        this.player = player;
        startingPrice = new BigDecimal("150.0");
        startingScore = 4;
    }

    public BigDecimal calculatePriceNews() {
        BigDecimal finalPrice = startingPrice;
        if (this.player.equals("Federer") || this.player.equals("Nadal") || this.player.equals("Djokovic")) {
            finalPrice = finalPrice.add(new BigDecimal("100.0"));
        }

        return finalPrice;
    }

    public int calculateNewsScore() {
        int finalScore = startingScore;
        if (this.player.equals("Federer") || this.player.equals("Nadal") || this.player.equals("Djokovic")) {
            finalScore += 3;
        }

        return finalScore;
    }
}
