package RegPC;

public class WashingMachine extends HouseholdAppliances{
    int turnCount;
    boolean isDisplay;

    public WashingMachine(int serialNumber, int varanty, int electrisityConsumption, int turnCount, boolean isDisplay) {
        super(serialNumber, varanty, electrisityConsumption);
        this.turnCount = turnCount;
        this.isDisplay = isDisplay;
    }

    public int getTurnCount() {
        return turnCount;
    }

    public void setTurnCount(int turnCount) {
        this.turnCount = turnCount;
    }

    public boolean isDisplay() {
        return isDisplay;
    }

    public void setDisplay(boolean display) {
        isDisplay = display;
    }

    @Override
    public void methodProcess() {
        super.methodProcess();
        System.out.println("I'm washing");
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "serialNumber=" + serialNumber +
                ", electrisityConsumption=" + electrisityConsumption +
                ", varanty=" + varanty +
                ", turnCount=" + turnCount +
                ", isDisplay=" + isDisplay +
                '}';
    }
}
