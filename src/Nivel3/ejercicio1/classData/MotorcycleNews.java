package Nivel3.ejercicio1.classData;

import java.math.BigDecimal;

public class MotorcycleNews extends News {
    private String team;
    private static BigDecimal startingPrice;
    private static int startingScore;

    public MotorcycleNews(String headline, String team) {
        super(headline);
        this.team = team;
        startingPrice = new BigDecimal("100.0");
        startingScore = 3;
    }

    public BigDecimal calculatePriceNews() {
        BigDecimal finalPrice = startingPrice;
        if (this.team.equals("Honda") || this.team.equals("Yamaha")) {
            finalPrice = finalPrice.add(new BigDecimal("50.0"));
        }

        return finalPrice;
    }

    public int calculateNewsScore() {
        int finalScore = startingScore;
        if (this.team.equals("Honda") || this.team.equals("Yamaha")) {
            finalScore += 3;
        }

        return finalScore;
    }
}

