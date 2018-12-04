package RegPC;

public class PC extends Devices{
    int battery;
    int screenSize;
    String operationSystem;

    public PC(int serialNumber, int varanty, int battery, int screenSize, String operationSystem) {
        super(serialNumber, varanty);
        this.battery = battery;
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }
}
