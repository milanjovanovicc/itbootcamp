package zadatak1;

public abstract class Animal {

    private String name;
    private String nickname;

    public Animal(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public abstract String sound();
}
