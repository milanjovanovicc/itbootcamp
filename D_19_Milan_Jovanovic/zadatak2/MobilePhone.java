package zadatak2;
//Mobilni telefon ext. racunar - jacina kamere(mpx), mreza(enum 3g/4g/5g)

public class MobilePhone extends PC{

    private String cameraQuality;
    private Service services;

    public MobilePhone(String numberOfProcessors, String memoryRAM, String memory, String cameraQuality, Service services) {
        super(numberOfProcessors, memoryRAM, memory);
        this.cameraQuality = cameraQuality;
        this.services = services;
    }

    public String getCameraQuality() {
        return cameraQuality;
    }

    public Service getServices() {
        return services;
    }

    @Override
    public String toString() {
        return "Number of processors: " + super.getNumberOfProcessors() + ", RAM: " + super.getMemoryRAM() + "GB, memory: " +
                super.getMemory() + "GB, camera: " + this.cameraQuality + "Megapixels, service: " + services;
    }
}
