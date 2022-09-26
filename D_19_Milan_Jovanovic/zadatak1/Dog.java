package zadatak1;

public class Dog extends Animal{

    private boolean goodBoy;

    public Dog(String name, String nickname, boolean goodBoy) {
        super(name, nickname);
        this.goodBoy = goodBoy;
    }

    public boolean isGoodBoy() {
        return goodBoy;
    }

    @Override
    public String sound() {
        return "woof";
    }

    public String  goodBoyChecker(){
        String outputBoy = "";
        if (this.goodBoy){
            outputBoy = "good boy";
        }else {
            outputBoy = "not good boy";
        }
        return outputBoy;
    }

    @Override
    public String toString() {
        return "I'm " + super.getName() + ", " + super.getName() + " " + super.getNickname() + " and I'm " +
                goodBoyChecker() + ", " + sound();
    }
}
