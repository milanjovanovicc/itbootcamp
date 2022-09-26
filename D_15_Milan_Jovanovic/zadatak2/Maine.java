package zadatak2;

public class Maine {
    public static void main(String[] args) {

        Worker worker1 = new Worker();
        worker1.workerID = "10";
        worker1.name = "Mile";
        worker1.lastname = "Jankovic";
        worker1.startYear = 1980;

        Worker worker2 = new Worker("11", "John", "Doe", 2015);
        Worker worker3 = new Worker("12", "John", "Smith", 2000);

        worker1.print(worker1.yearsOfWorking(), worker1.workerID, worker1.name, worker1.lastname);
        worker2.print(worker2.yearsOfWorking(), worker2.workerID, worker2.name, worker2.lastname);
        worker3.print(worker3.yearsOfWorking(), worker3.workerID, worker3.name, worker3.lastname);
    }
}
