package zadatak1;

public class Student {

    private String name;
    private String lastname;
    private String year;
    private String studentID;

    public Student(){

    }

    public Student(String name, String lastname, String year, String studentID){
        this.name = name;
        this.lastname = lastname;
        this.year = year;
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return this.name + " " + this.lastname + ", " + this.year + " - " + this.studentID;
    }
}
