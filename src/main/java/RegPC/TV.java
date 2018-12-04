package RegPC;

public class TV extends HouseholdAppliances {
    int screenWide;
    boolean isSmartTV;

    public TV(int serialNumber, int varanty, int electrisityConsumption, int screenWide, boolean isSmartTV) {
        super(serialNumber, varanty, electrisityConsumption);
        this.screenWide = screenWide;
        this.isSmartTV = isSmartTV;
    }

    public int getScreenWide() {
        return screenWide;
    }

    public void setScreenWide(int screenWide) {
        this.screenWide = screenWide;
    }

    public boolean isSmartTV() {
        return isSmartTV;
    }

    public void setSmartTV(boolean smartTV) {
        isSmartTV = smartTV;
    }

    @Override
    public void methodProcess() {
        super.methodProcess();
    }


}
