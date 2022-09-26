import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite vase ime: ");
        String ime = sc.next();
        System.out.println("Unesite vase prezime: ");
        String prezime = sc.next();
        System.out.println("Unesite broj predmeta: ");
        int brojPredmeta = sc.nextInt();
        double prosek = 0;

        for (int i = 2; i <= brojPredmeta*2; i+=2) {
            int suma = 0;
            for (int j = 1; j <= 3; j++) {
                System.out.println("Unesite ocenu " + j + " za predmet " + i + ":");
                int ocena = sc.nextInt();
                while (true) {
                    if (ocena <= 5 && ocena >= 1) {
                        break;
                    }
                    System.out.println("Unesite ponovo ocenu " + j + " za predmet " + i + ":");
                    ocena = sc.nextInt();
                }
                suma += ocena;
            }
            System.out.println("Prosecna ocena za " + i + " predmet je " + (suma / 3.0));
            prosek += (suma/3.0);
            //System.out.println(prosek);
        }
        System.out.println("Prosecna ocena za " + ime + " " + prezime+ " je " + (prosek / (brojPredmeta * 1.0)));
    }
}
