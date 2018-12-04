package com.company;

public class Sporty extends Car {
    String carSponsorePromo;
    int carSpeedRate;

    public Sporty(long vinNumber, int carSpeed, String carSponsorePromo, int carSpeedRate) {
        super(vinNumber, carSpeed);
        this.carSponsorePromo = carSponsorePromo;
        this.carSpeedRate = carSpeedRate;
    }

    public String getCarSponsorePromo() {
        return carSponsorePromo;
    }

    public void setCarSponsorePromo(String carSponsorePromo) {
        this.carSponsorePromo = carSponsorePromo;
    }

    public int getCarSpeedRate() {
        return carSpeedRate;
    }

    public void setCarSpeedRate(int carSpeedRate) {
        this.carSpeedRate = carSpeedRate;
    }
}
