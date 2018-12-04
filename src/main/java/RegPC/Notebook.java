package RegPC;

public class Notebook extends PC {
    String CPU;
    String RAM;

    public Notebook(int serialNumber, int varanty, int battery, int screenSize, String operationSystem, String CPU, String RAM) {
        super(serialNumber, varanty, battery, screenSize, operationSystem);
        this.CPU = CPU;
        this.RAM = RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    @Override
    public void methodProcess() {
        super.methodProcess();
        System.out.println("I'm programming");
    }

}
