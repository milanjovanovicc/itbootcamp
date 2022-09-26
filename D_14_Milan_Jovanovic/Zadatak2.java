public class Zadatak2 {
    public static void main(String[] args) {

        System.out.println("Ocekujem rezultat 49, dobio sam " + eksponent(7, 2));
        System.out.println("Ocekujem rezultat 125, dobio sam " + eksponent(5, 3));
        System.out.println("Ocekujem rezultat 0.015625, dobio sam " + eksponent(8, (-2)));
        System.out.println("Ocekujem da nema rezultata, dobio sam " + eksponent(-7, 3));
        System.out.println("Ocekujem rezultat 0, dobio sam " + eksponent(0, 5));
        System.out.println("Ocekujem rezultat 1, dobio sam " + eksponent(3, 0));
        System.out.println("Ocekujem rezultat 1.286008230452675, dobio sam " + eksponent(6, -5));
        System.out.println("Ocekujem rezultat 243, dobio sam " + eksponent(3, 5));
        System.out.println("Ocekujem rezultat 256, dobio sam " + eksponent(4, 4));
        System.out.println("Ocekujem rezultat 1, dobio sam " + eksponent(1, 9));

    }

    public static double eksponent(int vrednost, int eksp) {
        double resenje = 1;
        double proizvod = 1.0;
        if (vrednost >= 0) {
            if (eksp > 0) {
                for (int i = 0; i < eksp; i++) {
                    resenje = resenje * vrednost;
                }
            } else if (eksp < 0) {
                for (int i = 0; i > eksp; i--) {
                    proizvod = proizvod * vrednost;
            }
                resenje = 1 / proizvod;
            }
        } else {
            return 0;
        }
        return resenje;
    }
}
