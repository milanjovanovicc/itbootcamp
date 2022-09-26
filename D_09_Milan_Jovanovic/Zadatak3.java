import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite zeljenu temperaturu u celzijusima: ");
        double celzijus = sc.nextInt();

        double farenhajt = (celzijus * 9.0/5.0) + 32;

        System.out.println("Celzijus u farenhajt: " + celzijus + "C = " + farenhajt + "F");



    }
}
