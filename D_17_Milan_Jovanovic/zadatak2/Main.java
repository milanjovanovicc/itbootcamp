package zadatak2;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {


        Article art1 = new Article(1000.00, "T-shirt", "Brown", "01221584");
        Article art2 = new Article(4000.00, "Jacket", "Red", "0218910102");
        Article art3 = new Article(2500.00, "Trousers", "Orange", "00124589");
        Article art4 = new Article(1500.00, "Jeans", "Purple", "010102589");
        Article art5 = new Article(6000.00, "Dress", "Pink", "0102589771");

        Store zara = new Store("Zara", "8596");

        Customer customer1 = new Customer("John", "Doe", "065987469", "john.doe@mail.com", true);
        Customer customer2 = new Customer("Del", "Boy", "062584698", "del.boy@mail.com", false);

        zara.getArticles().add(art1);
        zara.getArticles().add(art2);
        zara.getArticles().add(art3);
        zara.getArticles().add(art4);
        zara.getArticles().add(art5);


        String[] customersOrder = {"01221584", "00124589", "0102589771"};

        for (int i = 0; i < customersOrder.length; i++) {
            for (int j = 0; j < zara.getArticles().size(); j++) {
                if (Objects.equals(customersOrder[i], zara.getArticles().get(j).getBarCode()));
                customer1.addToCart(zara.getArticles().get(j));
            }
        }

        double sum = 0;
        double discount = 0;
        for (int i = 0; i < customer1.getCart().size(); i++){
            if (customer1.isPremium()) {
                discount += customer1.getCart().get(i).getPrice() * 0.75;

            }else {
                sum += customer1.getCart().get(i).getPrice();
            }
        }

        if (customer1.isPremium()){
            System.out.println("Total price with a Premium is " + discount);
        }else {
            System.out.println("Total price without Premium is" + sum);
        }

    }

}
