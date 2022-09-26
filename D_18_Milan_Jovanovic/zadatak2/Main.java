package zadatak2;

public class Main {
    public static void main(String[] args) {


        Address address1 = new Address("Lole Ribara", "40", "12", "12000", "Pozarevac");
        Address address2 = new Address("Kosovska", "59", "10", "12000", "Belgrade");
        Address address3 = new Address("Cingrijina", "23", "22", "11000", "Belgrade");

        Citizen citizen1 = new Citizen("Herkul", "Poaro",1902, "98744563258",address1);
        Citizen citizen2 = new Citizen("Agatha", "Christi", 1890, "8510328585", address2);

        System.out.println(citizen1);
        System.out.println(citizen2);

        citizen2.setLastName("Johanson");
        System.out.println(citizen2);

        citizen1.setAddresses(address3);

        System.out.println("Citizen1 moved to a new location " + address3);

    }
}
