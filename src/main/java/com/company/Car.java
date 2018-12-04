package com.company;

public class Car {
    long vinNumber;
    int carSpeed;


    public Car(long vinNumber, int carSpeed) {
        this.vinNumber = vinNumber;
        this.carSpeed = carSpeed;
    }

    public long getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(long vinNumber) {
        this.vinNumber = vinNumber;
    }

    public int getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }


}
