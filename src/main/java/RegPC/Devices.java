package RegPC;

abstract public class Devices implements Interfaces {
    int serialNumber;
    int varanty;

    public Devices(int serialNumber, int varanty) {
        this.serialNumber = serialNumber;
        this.varanty = varanty;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getVaranty() {
        return varanty;
    }

    public void setVaranty(int varanty) {
        this.varanty = varanty;
    }

    @Override
    public String toString() {
        return "Devices{" +
                "serialNumber=" + serialNumber +
                ", varanty=" + varanty +
                '}';
    }

    @Override
    public void methodProcess() {

    }

    public void start() {
        System.out.println("Start");
    }

    public void stop() {
        System.out.println("Stop");
    }

}
