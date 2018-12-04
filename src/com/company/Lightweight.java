package com.company;

public class Lightweight extends Regulary{
    String carColor;
    int seatCount;


    public Lightweight(long vinNumber, int carSpeed, int carGasVolume, double fuelConsumption, String carColor, int seatCount) {
        super(vinNumber, carSpeed, carGasVolume, fuelConsumption);
        this.carColor = carColor;
        this.seatCount = seatCount;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }
}
