package zadatak2;

import java.util.ArrayList;

public class Customer {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String mail;
    private Boolean premium;
    private ArrayList<Article> cart = new ArrayList<>();

    public Customer() {
    }

    public Customer(String firstName, String lastName, String phoneNumber, String mail, Boolean premium) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.premium = premium;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Boolean isPremium() {
        return premium;
    }

    public void setPremium(Boolean premium) {
        this.premium = premium;
    }

    public ArrayList<Article> getCart() {
        return cart;
    }

    public void addToCart(Article article){
        this.cart.add(article);
    }

}
