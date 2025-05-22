package Nivel3.ejercicio1.classData;

import java.math.BigDecimal;

public abstract class News {
    private String headline;
    private String text;

    public News(String headline) {
        this.headline = headline;
        this.text = "";
    }

    public String getHeadline() {
        return this.headline;
    }

    public abstract BigDecimal calculatePriceNews();

    public abstract int calculateNewsScore();
}
