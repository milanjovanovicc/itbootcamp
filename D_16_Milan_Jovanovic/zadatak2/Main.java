package zadatak2;

public class Main {
    public static void main(String[] args) {

        Converter currency = new Converter(117);

        System.out.println(currency);

        currency.setRsd(1000);
        System.out.println(currency);

        currency.setRsd(15000);
        System.out.println(currency);

        currency.setRsd(-5000);
        System.out.println(currency);
    }


}
