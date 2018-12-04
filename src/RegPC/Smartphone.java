package RegPC;

public class Smartphone extends PC{
    int cameraPmx;
    boolean isSecondOperator;

    public Smartphone(int serialNumber, int varanty, int battery, int screenSize, String operationSystem, int cameraPmx, boolean isSecondOperator) {
        super(serialNumber, varanty, battery, screenSize, operationSystem);
        this.cameraPmx = cameraPmx;
        this.isSecondOperator = isSecondOperator;
    }

    public int getCameraPmx() {
        return cameraPmx;
    }

    public void setCameraPmx(int cameraPmx) {
        this.cameraPmx = cameraPmx;
    }

    public boolean isSecondOperator() {
        return isSecondOperator;
    }

    public void setSecondOperator(boolean secondOperator) {
        isSecondOperator = secondOperator;
    }

    @Override
    public void methodProcess() {
        super.methodProcess();
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }
}
