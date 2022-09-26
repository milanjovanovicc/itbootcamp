import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite mesec kada ste rodjeni: ");
        String mesec = sc.next();

        System.out.print("Unesite datum rodjenja: ");
        int datum = sc.nextInt();

        if (datum > 0 && datum <= 31) {

            if ((mesec.equalsIgnoreCase("Mart") && datum >= 21) ||
                    (mesec.equalsIgnoreCase("April") && datum <= 19)) {
                    System.out.println("Vi ste jarac u horoskopu.");
            } else if ((mesec.equalsIgnoreCase("April") && datum >= 20) ||
                    (mesec.equalsIgnoreCase("Maj") && datum <= 20)) {
                System.out.println("Vi ste bik u horoskopu");
            } else if ((mesec.equalsIgnoreCase("Maj") && datum >= 21) ||
                    (mesec.equalsIgnoreCase("Jun") && datum <= 20)) {
                System.out.println("Vi ste blizanac u horoskopu");
            }  else if ((mesec.equalsIgnoreCase("Jun") && datum >= 21) ||
                    (mesec.equalsIgnoreCase("Jul") && datum <= 22)) {
                System.out.println("Vi ste rak u horoskopu");
            } else if ((mesec.equalsIgnoreCase("Jul") && datum >= 23) ||
                    (mesec.equalsIgnoreCase("Avgust") && datum <= 22)) {
                System.out.println("Vi ste lav u horoskopu");
            } else if ((mesec.equalsIgnoreCase("Avgust") && datum >= 23) ||
                    (mesec.equalsIgnoreCase("Septembar") && datum <= 22)) {
                System.out.println("Vi ste devica u horoskopu");
            } else if ((mesec.equalsIgnoreCase("Septembar") && datum >= 23) ||
                    (mesec.equalsIgnoreCase("Oktobar") && datum <= 22)) {
                System.out.println("Vi ste vaga u horoskopu");
            } else if ((mesec.equalsIgnoreCase("Oktobar") && datum >= 23) ||
                    (mesec.equalsIgnoreCase("Novmebar") && datum <= 21)) {
                System.out.println("Vi ste skorpija u horoskopu");
            } else if ((mesec.equalsIgnoreCase("Novembar") && datum >= 22) ||
                    (mesec.equalsIgnoreCase("Decembar") && datum <= 21)) {
                System.out.println("Vi ste strelac u horoskopu");
            } else if ((mesec.equalsIgnoreCase("Decembar") && datum >= 22) ||
                    (mesec.equalsIgnoreCase("Januar") && datum <= 19)) {
                System.out.println("Vi ste jarac u horoskopu");
            } else if ((mesec.equalsIgnoreCase("Januar") && datum >= 20) ||
                    (mesec.equalsIgnoreCase("Februar") && datum <= 18)) {
                System.out.println("Vi ste vodolija u horoskopu");
            } else if ((mesec.equalsIgnoreCase("Februar") && datum >= 19) ||
                    (mesec.equalsIgnoreCase("Mart") && datum <= 20)) {
                System.out.println("Vi ste riba u horoskopu");
            } else {
                System.out.println("Uneli ste pogresno mesec.");
            }
        } else {
            System.out.println("Niste uneli odgovarajuci datum.");
        }


    }
}
