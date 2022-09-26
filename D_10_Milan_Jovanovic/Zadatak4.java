import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite svoju tezinu: ");
        double tezina = sc.nextDouble();

        if (tezina > 0) {
            System.out.print("Unesite jednu od ponudjenih planeta (Jupiter, Saturn, Uran, Neptun, Pluton): ");
            String planeta = sc.next();

            if (planeta.equalsIgnoreCase("Jupiter")) {
                System.out.println("Vasa tezina na " + planeta + "u je " + (tezina * 2.34));
            } else if (planeta.equalsIgnoreCase("Saturn")) {
                System.out.println("Vasa tezina na " + planeta + "u je " + (tezina * 1.06));
            } else if (planeta.equalsIgnoreCase("Uran")) {
                System.out.println("Vasa tezina na " + planeta + "u je " + (tezina * 0.92));
            } else if (planeta.equalsIgnoreCase("Neptun")) {
                System.out.println("Vasa tezina na " + planeta + "u je " + (tezina * 1.19));
            } else if (planeta.equalsIgnoreCase("Pluton")) {
                System.out.println("Vasa tezina na " + planeta + "u je " + (tezina * 0.06));
            } else {
                System.out.println("Uneli ste pogresno planetu.");
            }

        } else {
                    System.out.println("Molimo vas unesite validnu vrednost!");
                }




    }
}
