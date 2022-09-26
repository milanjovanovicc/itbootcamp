package zadatak1;

public class Accounting {

    String article;
    double price;


    public Accounting() {

    }

    public Accounting(String article, double price){
        this.article = article;
        this.price = price;
    }

    public double sum(int quantity){
        return this.price * quantity;
    }
}
