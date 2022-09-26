public class Zadatak3 {
    public static void main(String[] args) {
        //Napisati niz koji sadrzi brojeve 1, 1, 5, 3, 3, 10, 11, 4, 4.
        // U drugi niz upisati sve brojeve iz prve ali bez ponavljanja istog broja, ispisati taj niz.
        // Ocekivani rezultat 1, 5, 3, 10, 11, 4. Treba da radi kao DISTINCT u SQLu

        int[] niz = {1, 1, 5, 3, 3, 10, 11, 4, 4};
        int i,j;


        for (i = 0; i < niz.length; i++){
            for (j = 0; j < niz.length-1; j++) {
                if (niz[i] == niz[j]) {
                    break;
                }
            }
            if (i == j) {
                System.out.println(niz[i]);
            }
        }
    }
}