import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite jedan broj od 0 do 100.");
        int broj = sc.nextInt();

        if (broj >= 0 && broj <= 100) {
            if (broj == 0) {
                System.out.println("Ne mozete deliti sa 0.");
            } else if (broj % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (broj % 5 == 0) {
                System.out.println("Buzz");
            } else if (broj % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println("Broj nije deljiv ni sa 5 ni sa 3.");
            }
        } else {
            System.out.println("Uneli ste broj van definisanog opsega.");
        }




    }
}
