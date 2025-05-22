package Nivel3.ejercicio1.classData;

import java.math.BigDecimal;

public class BasketballNews extends News {
    private String competition;
    private String club;
    private static BigDecimal startingPrice;
    private static int startingScore;

    public BasketballNews(String headline, String competition, String club) {
        super(headline);
        this.competition = competition;
        this.club = club;
        startingPrice = new BigDecimal("250.0");
        startingScore = 4;
    }

    public BigDecimal calculatePriceNews() {
        BigDecimal finalPrice = startingPrice;
        if (this.competition.equals("Euroliga")) {
            finalPrice = finalPrice.add(new BigDecimal("75"));
        }

        if (this.club.equals("Barça") || this.club.equals("Madrid")) {
            finalPrice.add(new BigDecimal("75.0"));
        }

        return finalPrice;
    }

    public int calculateNewsScore() {
        int finalScore = startingScore;
        if (this.competition.equals("Euroliga")) {
            finalScore += 3;
        } else if (this.competition.equals("ABC")) {
            finalScore += 2;
        }

        if (this.club.equals("Barça") || this.club.equals("Madrid")) {
            ++finalScore;
        }

        return finalScore;
    }
}
