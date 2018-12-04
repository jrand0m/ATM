package com.company;

public class Regulary extends Car{
    int carGasVolume;
    double fuelConsumption;


    double getFuelConsumptionCount (int miles){ //miles * cnsumption / 100km
        return (miles * fuelConsumption)/100;

    }


    public Regulary(long vinNumber, int carSpeed, int carGasVolume, double fuelConsumption) {
        super(vinNumber, carSpeed);
        this.carGasVolume = carGasVolume;
        this.fuelConsumption = fuelConsumption;
    }

    public int getCarGasVolume() {
        return carGasVolume;
    }

    public void setCarGasVolume(int carGasVolume) {
        this.carGasVolume = carGasVolume;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }


}
