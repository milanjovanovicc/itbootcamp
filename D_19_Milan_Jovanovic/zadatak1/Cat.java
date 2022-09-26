package zadatak1;

public class Cat extends Animal{

    private int chonk;

    public Cat(String name, String nickname, int chonk) {
        super(name, nickname);
        this.chonk = chonk;
    }

    public int getChonk() {
        return chonk;
    }

    @Override
    public String sound() {
        return "meow";
    }

    public String chonkerChecker(){
        String outputChonker = "";
        if ( this.chonk > 5){
            outputChonker = "chonk";
        }else {
            outputChonker = "not chonk";
        }
        return outputChonker;
    }

    @Override
    public String toString() {
        return "I'm " + super.getName() + ", " + super.getName() + " " + super.getNickname() + " and I'm " +
                chonkerChecker() + ", " + sound();
    }
}
