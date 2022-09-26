package zadatak1;

//Sportsman (name, lastname, personalID, Level) - parent

public abstract class Sportsman {

    private String name;
    private String lastname;
    private String personalID;
    private Level level;

    public Sportsman(String name, String lastname, String personalID, Level level) {
        this.name = name;
        this.lastname = lastname;
        this.personalID = personalID;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPersonalID() {
        return personalID;
    }

    public Level getLevel() {
        return level;
    }
}
