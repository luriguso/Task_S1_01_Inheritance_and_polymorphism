package Nivel3.ejercicio1;

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

    public abstract Double calculate_price_news();

    public abstract int calculate_news_score();
}
