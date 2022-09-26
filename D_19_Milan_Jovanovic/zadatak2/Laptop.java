package zadatak2;
//Laptop ext. racunar - velicina ekrana, tastatura(enum int./US)


public class Laptop extends PC{

    private String screenSize;
    private Keyboard keyboards;

    public Laptop(String numberOfProcessors, String memoryRAM, String memory, String screenSize, Keyboard keyboards) {
        super(numberOfProcessors, memoryRAM, memory);
        this.screenSize = screenSize;
        this.keyboards = keyboards;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public Keyboard getKeyboards() {
        return keyboards;
    }

    @Override
    public String toString() {
        return "Number of processors: " + super.getNumberOfProcessors() + ", RAM: " + super.getMemoryRAM() + "GB, memory: " +
                super.getMemory() + "GB, screen: " + this.screenSize + "\", keyboard: " + keyboards;
    }
}
