import java.util.Scanner;

public class Zadatak1 {
//Napisati metode sabiranje, oduzimanje, mnozenje i deljenje.
// Korisnik unosi preko skenera 2 broja i karakter + - * / koji odgovaraju metodi koju ste napisali.
// Program treba da pozove tacnu metodu i ispise rezultat.
// Korisnik moze da unosi brojeve neogranicen broj puta dok ne unese pogresan karakter (da nije + - * /)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Unesite prvi broj: ");
            int broj1 = sc.nextInt();
            System.out.print("Unesite operaciju: ");
            String operacija = sc.next();
            System.out.print("Unesite drugi broj: ");
            int broj2 = sc.nextInt();

            
            if (operacija.equals("+")) {
                sabiranje(broj1, broj2);
            } else if (operacija.equals("-")) {
                oduzimanje(broj1,broj2);
            } else if (operacija.equals("*")) {
                mnozenje(broj1,broj2);
            } else if (operacija.equals("/")) {
                if (broj2 != 0) {
                    deljenje(broj1,broj2);
                } else {
                    System.out.println("Ne mozete deliti sa 0.");
                }
            } else {
                System.out.println("Uneli ste neodgovarajuc znak");
                break;
            }
        }
    }

    public static void sabiranje(int prviSabirak, int drugiSabirak) {
        System.out.println("Zbir je: " + (prviSabirak + drugiSabirak));
    }

    public static void oduzimanje(int umanjenik, int umanjilac) {
        System.out.println("Razlika je: " + (umanjenik - umanjilac));
    }

    public static void mnozenje(int prviCinioc, int drugiCinioc) {
        System.out.println("Proizvod je: " + (prviCinioc * drugiCinioc));
    }

    public static void deljenje(int deljenik, int delilac) {
        System.out.println("Kolicnik je: " + (deljenik / (delilac*1.0) ));
    }


}
