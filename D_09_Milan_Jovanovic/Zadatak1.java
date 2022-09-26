import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite vasu prvu: ");
        String ime = sc.next();
        System.out.print("Unesite drugu rec: ");
        String prezime = sc.next();

        System.out.println("Vase tacka zarez string je: " + ime + ";" + prezime);

    }
}
