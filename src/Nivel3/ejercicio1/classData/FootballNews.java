package Nivel3.ejercicio1.classData;

import java.math.BigDecimal;

public class FootballNews extends News {
    private String competition;
    private String club;
    private String player;
    private static BigDecimal startingPrice;
    private static int startingScore;

    public FootballNews(String headline, String competition, String club, String player) {
        super(headline);
        this.competition = competition;
        this.club = club;
        this.player = player;
        startingPrice = new BigDecimal("300.0");
        startingScore = 5;
    }

    public BigDecimal calculatePriceNews() {
        BigDecimal finalPrice = startingPrice;
        if (this.competition.equals("Liga de Campeones")) {
            finalPrice = finalPrice.add(new BigDecimal("100.0"));
        }

        if (this.club.equals("Barça") || this.club.equals("Madrid")) {
            finalPrice = finalPrice.add(new BigDecimal("100.0"));
        }

        if (this.player.equals("Ferran Torres") || this.player.equals("Benzema")) {
            finalPrice = finalPrice.add(new BigDecimal("50.0"));
        }

        return finalPrice;
    }

    public int calculateNewsScore() {
        int finalScore = startingScore;
        if (this.competition.equals("Liga de Campeones")) {
            finalScore += 3;
        } else if (this.competition.equals("Liga")) {
            finalScore += 2;
        }

        if (this.club.equals("Barça") || this.club.equals("Madrid")) {
            ++finalScore;
        }

        if (this.player.equals("Ferran Torres") || this.player.equals("Benzema")) {
            ++finalScore;
        }

        return finalScore;
    }
}