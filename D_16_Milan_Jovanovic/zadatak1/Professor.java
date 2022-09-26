package zadatak1;

public class Professor {

    private String name;
    private String lastname;
    private String title;
    private String faculty;

    public Professor(){

    }

    public Professor(String name, String lastname, String title, String faculty){
        this.name = name;
        this.lastname = lastname;
        this.title = title;
        this.faculty = faculty;
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

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    @Override
    public String toString() {
        return this.title + " " + this.name + " " + this.lastname + ", " + this.faculty;
    }
}
