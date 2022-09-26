package zadatak1;

//Football (Sportsman, Position, value) -child

public class Football extends Sportsman{

    private double value;
    private Position position;

    public Football(String name, String lastname, String personalID, Level level, double value, Position position) {
        super(name, lastname, personalID, level);
        setValue(value);
        this.position = position;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {

        if (value > 0) {
            this.value = value;
        }else {
            System.err.println("Value must be postive!");
        }
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return super.getName() + " " + super.getLastname() + ", Personal ID: " + super.getPersonalID() + ", " + getLevel() +
                ", curent value: " + this.getValue() + " and plays on " + this.getPosition() + " position.";
    }
}
