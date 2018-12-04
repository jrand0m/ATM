package com.company;

public class Freight extends Regulary {
    int maxLoad;
    double priceForOnekm;


    public Freight(long vinNumber, int carSpeed, int carGasVolume, double fuelConsumption, int maxLoad, double priceForOnekm) {
        super(vinNumber, carSpeed, carGasVolume, fuelConsumption);
        this.maxLoad = maxLoad;
        this.priceForOnekm = priceForOnekm;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double getPriceForOnekm() {
        return priceForOnekm;
    }

    public void setPriceForOnekm(double priceForOnekm) {
        this.priceForOnekm = priceForOnekm;
    }
}
