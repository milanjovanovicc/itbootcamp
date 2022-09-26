package zadatak1;

//Tennis (Sportsman ,ATP rank) -child

public class Tennis extends Sportsman{

    private int rankATP;

    public Tennis(String name, String lastname, String personalID, Level level, int rankATP) {
        super(name, lastname, personalID, level);
        setRankATP(rankATP);
    }

    public int getRankATP() {
        return rankATP;
    }

    public void setRankATP(int rankATP) {

        if (rankATP > 0) {
            this.rankATP = rankATP;
        }else {
            System.err.println("Value must be postive!");
        }
    }

    @Override
    public String toString() {
        return super.getName() + " " + super.getLastname() + ", Personal ID: " +super.getPersonalID() + ", " + getLevel() +
                ", curently: " + this.rankATP + " in the world!";
    }
}
