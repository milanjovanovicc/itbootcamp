package zadatak1;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Milan", "Milanovic", 90_000);
        Employee employee2 = new Employee("Sara", "Saric", 115_000);
        Employee employee3 = new Employee("Zorka", "Zoric", 80_000);
        Employee employee4 = new Employee("Zdravko", "Zdravkovic", 110_000);
        Employee employee5 = new Employee("Stanko", "Stankovic", 85_000);

        Employee employee6 = new Employee("Joakim", "Vujic", 100_000);
        Employee employee7 = new Employee("Milena", "Pavlovic", 100_000);
        Employee employee8 = new Employee("Starina", "Novak", 90_000);
        Employee employee9 = new Employee("Josip", "Broz", 75_000);
        Employee employee10 = new Employee("Jovanka", "Broz", 115_000);

        Company firstCompany = new Company("First Comapny");
        Company secondCompany = new Company("Second Company");

        firstCompany.addition(employee1);
        firstCompany.addition(employee2);
        firstCompany.addition(employee3);
        firstCompany.addition(employee4);
        firstCompany.addition(employee5);

        secondCompany.addition(employee6);
        secondCompany.addition(employee7);
        secondCompany.addition(employee8);
        secondCompany.addition(employee9);
        secondCompany.addition(employee10);

        System.out.println(firstCompany);
        System.out.println(secondCompany);

        Employee employee11 = new Employee("Slobodan", "Milosevic", 120_000);
        firstCompany.addition(employee11);
        secondCompany.addition(employee11);

        System.out.println(firstCompany);
        System.out.println(secondCompany);






    }
}