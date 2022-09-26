import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        int a = sc.nextInt();
        System.out.print("Unesite drugi broj: ");
        int b = sc.nextInt();
        System.out.print("Unesite treci broj: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " je najveci broj.");
        } else if (b > a && b > c ) {
            System.out.println(b + " je najveci broj.");
        } else if (c > a && c > b) {
            System.out.println(c + " je najveci broj.");
        } else {
            System.out.println("Pogresno ste uneli broj. Pokusajte ponovo.");
        }


    }
}
