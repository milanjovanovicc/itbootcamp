package zadatak2;

import java.util.ArrayList;

public class Store {

    private String name;
    private String PIB;
    private ArrayList<Article> articles = new ArrayList<>();

    public Store() {
    }

    public Store(String name, String PIB) {
        this.name = name;
        this.PIB = PIB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPIB() {
        return PIB;
    }

    public void setPIB(String PIB) {
        this.PIB = PIB;
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void addArticles(Article article){
        this.articles.add(article);
    }

}
