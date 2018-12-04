package RegPC;

abstract public class HouseholdAppliances extends Devices {
    int electrisityConsumption;

    public HouseholdAppliances(int serialNumber, int varanty, int electrisityConsumption) {
        super(serialNumber, varanty);
        this.electrisityConsumption = electrisityConsumption;
    }

    public int getElectrisityConsumption() {
        return electrisityConsumption;
    }

    public void setElectrisityConsumption(int electrisityConsumption) {
        this.electrisityConsumption = electrisityConsumption;
    }

    @Override
    public void methodProcess() {
        super.methodProcess();
    }


}
