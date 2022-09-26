package zadatak1;

import java.util.ArrayList;

public class Company {

    private String companyName;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(){

    }

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public String maxSalary(){
        String maxi = "";
        int max = 0;
        for (int i = 0; i < employees.size(); i++){
            if (employees.get(i).getSalary() > max){
                max = employees.get(i).getSalary();
            }
            if (max == employees.get(i).getSalary()){
                maxi = String.valueOf(employees.get(i));
            }
        }
        return maxi;
    }

    public String minSalary(){
        String mini = "";
        int min = employees.get(0).getSalary();
        for (int i = 0; i < employees.size(); i++){
            if (employees.get(i).getSalary() < min){
                min = employees.get(i).getSalary();
            }
            if (min == employees.get(i).getSalary()){
                mini = String.valueOf(employees.get(i));
            }
        }
        return mini;
    }

    public double avgSalary(){
        double sum = 0;
        for (int i = 0; i < employees.size(); i++){
            sum += employees.get(i).getSalary();
        }
        return sum / employees.size();
    }

    public void addition(Employee employee){
        this.employees.add(employee);
    }

    @Override
    public String toString() {
        return "Firma: " + this.companyName + "\r\n" +
               "najplaceniji ranik: " + maxSalary() +  "\r\n" +
                "najmanje placen radnik: " + minSalary() + "\r\n" +
                "prosecna plata: " + avgSalary() + "\r\n";
    }
}
