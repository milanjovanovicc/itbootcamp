import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite svoje ime: ");
        String ime = sc.next();

        System.out.print("Unesite svoje prezime: ");
        String prezime = sc.next();

        System.out.print("Unesite godinu rodjenja: ");
        int godiste = sc.nextInt();
        int godina = 2022 - godiste;

        System.out.println("Vi se zovete " + ime + " " + prezime + " i imate " + godina + " godina.");



    }
}
