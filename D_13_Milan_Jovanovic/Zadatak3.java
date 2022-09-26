public class Zadatak3 {
    public static void main(String[] args) {

        int[] niz1 = {2,5,6,8,9};
        int[] niz2 = {22,78,90,54,12};
        int[] niz3 = {2,67,5,23,78};

        //System.out.println(sort(niz1));
        stampanje(niz1, sort(niz1));

    }

    public static int[] sort(int[] niz) {
        int[] sortiranNiz = new int[niz.length];
        for (int i = 0; i< niz.length; i++) {
            sortiranNiz[i] = niz[i];
        }
        boolean provera = true;
        int drzac;
        while (provera) {
            provera = false;
            for (int i=0; i< sortiranNiz.length-1; i++){
                if (sortiranNiz[i] < sortiranNiz[i+1]) {
                     drzac = sortiranNiz[i+1];
                     sortiranNiz[i] = sortiranNiz[i+1];
                     sortiranNiz[i+1] = drzac;
                     provera = true;

                }
            }
        }

        return sortiranNiz;

    }

    public static void stampanje(int[] niz1, int[] niz2) {
        for (int i=0; i< niz1.length; i++) {
            System.out.println("Element " + i + " sadrzi " + niz1[i]);
        }
        System.out.println("--------------------------------------------");
        for (int i=0; i< niz2.length; i++) {
            System.out.println("Element " + i + " sadrzi " + niz2[i]);

        }
    }
}
