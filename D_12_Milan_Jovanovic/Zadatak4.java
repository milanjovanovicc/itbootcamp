public class Zadatak4 {
    public static void main(String[] args) {
//Napisati niz koji sadrzi brojeve od 1 do 10 koristeci petlju.
// Napraviti drugi niz koji ce imati brojeve pomerene za 2 u desno u odnosu na prvi niz.
// Prvi niz bi izgledao 1 2 3 .. 10, ≈drugi niz bi trebao da izgleda 3, 4, 5, 6, 7, 8, 9, 10, 1, 2. Ispisati drugi niz.

        int[] niz1 = new int[11];
        int pomeraj = 3;
        int[] niz2 = new int[niz1.length-1+pomeraj];
        int i;

        for (i = 1; i <= 10; i++) {
            niz1[i] = i;
        }
        for (i = pomeraj; i < niz2.length; i++) {
            niz2[i] = i;
            if (niz2[i] > 10) {
                niz2[i] = niz2[i] % 10;
            }
            System.out.println(niz2[i]);
        }
    }
}
