import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite username: ");
        String username = sc.next();

        System.out.print("Unesite password: ");
        String password = sc.next();

        if (username.equalsIgnoreCase("milanj94") && password.equals("123456789")) {
            System.out.println("Uspesno ste ulogovani!");
        }

        System.out.println("Kraj programa.");


    }
}
