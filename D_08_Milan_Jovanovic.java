public class D_08_Milan_Jovanovic_NS115QA6 {
    public static void main(String[] args) {

        int x, y, z;
        x = 3;
        y = 5;
        z = x * y;
        System.out.println(z);
        // Dva prosta broja za koja znam resenje i da vidim da nemam slucajno neku gresku u kodu koju treba da ispravim

        x = 0;
        y = 5;
        z = x * y;
        System.out.println(z);
        // Proveravam da li cu dobiti resenje ili ce mi izbaciti gresku za brojeve za koje znam resenje

        x = -3;
        y = 5;
        z = x * y;
        System.out.println(z);
        // Proveravam da li radi mnozenje sa negativnim brojevima za brojeve za koje znam resenje

        x = 3;
        y = -5;
        z = x * y;
        System.out.println(z);
        // Proveravam da li ce izmnoziti dva broja, ako je drugi broj negativan jer moze doci do nagomilavanja
        // znakova npr. (x *- y) i da mi izbaci gresku

        x = 2147483648;
        y = 1;
        z = x * y;
        System.out.println(z);
        // Ovaj slucaj nema resenja zato sto se resenje ne nalazi u intedzer domenu.
        // Greska bi se ispravila tako sto bi se x vrednost smanjila za 1 (2147483647) i tada bi se resenje nalazilo u
        // intedzer domenu.

        x = 2147483647;
        y = 1;
        z = x * y;
        System.out.println(z);
        // Resenje greske iz prethodnog primera, x vrednost (2147483648) umanjena za 1 (2147483647)

        x = 1;
        y = -2147483648;
        z = x * y;
        System.out.println(z);
        // Proveravam negativnu granicu intedzer domena za brojeve za koje znam resenje




    }
}
