public class Zadatak1 {
    public static void main(String[] args) {
//Kreirati niz od 5 brojeva po vasoj zelji. Kreirati drugi niz koji koji je prazan i ima velicinu 5.
//Prekopirati iz prvog niza u drugi brojeve u obrnutom redosledu. Npr niz 1 ima brojeve 5 3 1 0 7,
//drugi niz ce onda trebati da ima 7 0 1 3 5

        int niz1[] = new int[5];
        niz1[0] = 2;
        niz1[1] = 6;
        niz1[2] = 9;
        niz1[3] = 5;
        niz1[4] = 7;
        int niz2[] = new int[5];
        int j = 0;

        for (int i = 1; i <= niz1.length; i++) {
            niz2[j] = niz1[niz1.length - i];
            System.out.println(niz2[j]);
        }
    }
}
