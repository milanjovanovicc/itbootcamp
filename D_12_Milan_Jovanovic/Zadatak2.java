public class Zadatak2 {
    public static void main(String[] args) {
//Napisati niz koji sadrzi brojeve 1, 5, 7, 10, 8. Program treba da nadje brojeve koji fale u tom nizu i da ih ispise.

        int niz[] = {1, 5, 7, 10, 8};
        int min = niz[0];
        int max = niz[niz.length - 1];

        for (int i = 0; i < niz.length - 1; i++) {
            if (niz[i] > max) {
                max = niz[i];
            }
            if (niz[i] < min) {
                min = niz[i];
            }
        }
        int niz2[] = new int[max];

        for (int i = min; i <= max; i++) {
            for (int j = 0; j < niz.length; j++) {
                if (i == niz[j]) {
                    break;
                }
                if (j == niz.length - 1) {
                    System.out.println(i);
                }
            }
        }
    }
}
