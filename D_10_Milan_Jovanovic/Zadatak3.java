import java.util.Locale;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite svotu u dinarima: ");
        int svota = sc.nextInt();


        if (svota > 0) {
            System.out.print("Unesite zeljenu valutu: ");
            String valuta = sc.next().toUpperCase(Locale.ROOT);

            switch (valuta) {

                case "EUR":
                    System.out.println("EUR --> " + (svota / 117));
                    break;

                case "AUD":
                    System.out.println("AUD --> " + (svota / 81));
                    break;

                case "CAD":
                    System.out.println("CAD --> " + (svota / 89));
                    break;

                case "RUB":
                    System.out.println("RUB --> " + (svota / 2));
                    break;

                case "USD":
                    System.out.println("USD --> " + (svota / 114));
                    break;

                case "GBP":
                    System.out.println("GBP --> " + (svota / 139));
                    break;

                default:
                    System.out.println("Uneli ste pogresno valutu. Pokusajte ponovo.");
                    break;
            }
        } else {
            System.out.println("Vrednosti moraju biti pozitivne.");
        }



    }
}
