package zadatak1;

public class Rectangle {

    private int a;
    private int b;

    public Rectangle() {
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (a > 0) {
            this.a = a;
        }else {
            System.err.println("Number must be positive!");
        }
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if (b > 0) {
            this.b = b;
        }else {
            System.err.println("Number must be positive!");
        }
    }

    public int circumference(){
        return 2 * getA() + 2 * getB();
    }

    public int area(){
        return getA() * getB();
    }

    @Override
    public String toString() {
        return "A: " + this.a + "cm, B: " + this.b + "cm" + "\r\n" +
                "Perimeter: " + circumference() + "cm" + "\r\n" +
                "Area: " + area() + "cm2";

    }
}
