import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] niz = {2,5,6,8,9,4};
        System.out.print("Unesite jedan broj: ");
        int broj = sc.nextInt();

        if (praviBroj(niz, broj) ) {
            System.out.println("Broj " + broj + " se nalazi u nizu.");
        } else {
            System.out.println("Broj " + broj + " se ne nalazi u nizu.");
        }
    }

    public static boolean praviBroj(int[] niz, int nepoznatBroj) {
        boolean provera = false;
        for (int i = 0; i < niz.length; i++) {

            if (niz[i] == nepoznatBroj) {
                provera = true;
                break;
            } else {
                provera = false;
            }
        }
        return provera;

    }
}
