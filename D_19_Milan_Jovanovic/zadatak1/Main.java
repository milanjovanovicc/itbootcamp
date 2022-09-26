package zadatak1;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Dzeki", "Dzoni", true);
        Animal dog2 = new Dog("Milorad", "Mile", false);
        Dog dog3 = new Dog("Leonardo", "Leo", true);

        Cat cat1 = new Cat("Cicko", "Cile", 6);
        Animal cat2 = new Cat("Cipiripi", "Cipi", 5);
        Animal cat3 = new Cat("Macan", "Maca", 7);

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);




    }
}