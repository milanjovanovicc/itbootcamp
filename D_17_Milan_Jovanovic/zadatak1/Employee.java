package zadatak1;

public class Employee {

    private String name;
    private String lastname;
    private int salary;

    public Employee(){

    }

    public Employee(String name, String lastname, int salary) {
        this.name = name;
        this.lastname = lastname;
        if (salary >= 80_000 && salary <= 120_000) {
            this.salary = salary;
        }else {
            System.out.println("Salary must be in given range!");
        }
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return this.name + " " + this.lastname + ", " + this.salary;
    }
}
