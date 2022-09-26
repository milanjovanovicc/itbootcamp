package zadatak2;
//Racunar - br. procesora, kolicinu RAM, kolicinu memorije


public class PC {

    private String numberOfProcessors;
    private String memoryRAM;
    private String memory;

    public PC(String numberOfProcessors, String memoryRAM, String memory) {
        this.numberOfProcessors = numberOfProcessors;
        this.memoryRAM = memoryRAM;
        this.memory = memory;
    }

    public String getNumberOfProcessors() {
        return numberOfProcessors;
    }

    public String getMemoryRAM() {
        return memoryRAM;
    }

    public String getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return "Number of processors: " + this.numberOfProcessors + ", RAM: " + this.memoryRAM + "GB, memory: " +
                this.memory + "GB";
    }
}
