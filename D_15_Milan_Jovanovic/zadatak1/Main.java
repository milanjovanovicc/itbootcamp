package zadatak1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Accounting orbit = new Accounting();
        orbit.article = "Orbit";
        orbit.price = 59;

        Accounting chickenWings = new Accounting("Chicken wings", 259);

        System.out.println("How many " + orbit.article + " you want: ");
        int quantity = input.nextInt();

        System.out.println("Your total amout for " + orbit.article + " is " + chickenWings.sum(quantity));

        System.out.println("How many " + chickenWings.article + " you want: ");
        quantity = input.nextInt();

        System.out.println("Your total amout for " + chickenWings.article + " is " + chickenWings.sum(quantity));
    }
}
