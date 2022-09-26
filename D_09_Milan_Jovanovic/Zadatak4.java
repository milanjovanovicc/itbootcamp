import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite jedan broj: ");
        double broj = sc.nextDouble();

        if (broj < 10) {
            System.out.println("Uneti broj je manji od 10.");
        }
        if (broj >= 10) {
            System.out.println("Uneti broj je jednak ili veci od 10.");
        }
        System.out.println("Kraj programa.");



    }
}
