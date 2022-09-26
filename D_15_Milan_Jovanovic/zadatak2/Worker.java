package zadatak2;

import javax.crypto.spec.PSource;

public class Worker {

    String workerID;
    String name;
    String lastname;
    int startYear;

    public Worker(){

    }

    public Worker(String workerID, String name, String lastname, int startYear){
        this.workerID = workerID;
        this.name = name;
        this.lastname = lastname;
        this.startYear = startYear;
    }

    public boolean yearsOfWorking(){
        if ((2022 - this.startYear) > 10){
            return true;
        }
        return false;
    }

    public void print(boolean overTenYears,String workerID, String name, String lastname){
        if (overTenYears){
          System.out.println("ID " + workerID + " " + name + " " + lastname + " is more than 10 years in this company.");
        }else {
            System.out.println("ID " + workerID + " " + name + " " + lastname + " is not more than 10 years in this company.");
        }
    }
}
