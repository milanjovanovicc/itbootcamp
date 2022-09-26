import java.util.Locale;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Koji operativni sistem koristi vas telefon ?");
        String os = sc.next();


            if (os.equalsIgnoreCase("android")) {
                System.out.println("Korisnik koristi android");
            }
            if (os.equalsIgnoreCase("iphone")) {
                System.out.println("Korisnik koristi iphone");
            }
            if (!os.equalsIgnoreCase("android")) {
                if (!os.equalsIgnoreCase("iphone")) {
                    System.out.println("Ne znam sta korisnik koristi.");
                }
            }
    }
}
