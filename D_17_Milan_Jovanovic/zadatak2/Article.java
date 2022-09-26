package zadatak2;

public class Article {

    private Double price;
    private String name;
    private String colour;
    private String barCode;

    public Article() {
    }

    public Article(Double price, String name, String colour, String barCode) {
        this.price = price;
        this.name = name;
        this.colour = colour;
        this.barCode = barCode;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }
}
