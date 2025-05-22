package Nivel3.ejercicio1.classData;

import java.math.BigDecimal;

public class F1News extends News {
    private String team;
    private static BigDecimal startingPrice;
    private static int startingScore;

    public F1News(String headline, String team) {
        super(headline);
        this.team = team;
        startingPrice = new BigDecimal("100.0");
        startingScore = 4;
    }

    public BigDecimal calculatePriceNews() {
        BigDecimal finalPrice = startingPrice;
        if (this.team.equals("Ferrari") || this.team.equals("Mercedes")) {
            finalPrice = finalPrice.add(new BigDecimal("50.0"));
        }

        return finalPrice;
    }

    public int calculateNewsScore() {
        int finalScore = startingScore;
        if (this.team.equals("Ferrari") || this.team.equals("Mercedes")) {
            finalScore += 2;
        }

        return finalScore;
    }
}
