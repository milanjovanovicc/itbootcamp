package zadatak1;

public class Main {
    public static void main(String[] args) {

        Student mirko = new Student("Mirko", "Slavkovic", "1980", "IT980");
        Student slavko = new Student("Slavko", "Mirkovic", "1980", "IT981");
        Student milan = new Student("Milan", "Jovanovic", "1994", "R29/13");

        Professor marko = new Professor("Marko", "Markovic", "Mr", "DIF");
        Professor balsa = new Professor("Balsa", "Jaksic", "Dr", "MFUB");

        System.out.println(mirko);
        System.out.println(slavko);
        System.out.println(milan);

        milan.setName("Rolex");
        milan.setLastname("Petrovic");
        milan.setYear("1998");
        milan.setStudentID("SE100");
        System.out.println(milan);

        System.out.println(marko);
        System.out.println(balsa);
    }
}