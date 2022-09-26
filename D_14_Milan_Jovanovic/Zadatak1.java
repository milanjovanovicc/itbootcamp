import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        int prviBroj = sc.nextInt();
        System.out.print("Unesite drugi broj: ");
        int drugiBroj = sc.nextInt();
        System.out.print("Unesite treci broj: ");
        int treciBroj = sc.nextInt();

        if (redom(prviBroj, drugiBroj, treciBroj)) {
            System.out.println("Brojevi su jedan za drugim");
        } else {
            System.out.println("Brojevi nisu jedan za drugim.");
        }
    }

    public static boolean redom(int broj1, int broj2, int broj3) {
        boolean provera = false;

        if (broj2 == (broj1+1) || broj2 == (broj3-1)) {
            provera = true;
        } else {
            provera = false;
        }
        return provera;
    }
}
