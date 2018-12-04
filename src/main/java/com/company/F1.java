package com.company;

public class F1 extends Sporty {

    String driverName;


    public F1(long vinNumber, int carSpeed, String carSponsorePromo, int carSpeedRate, String driverName) {
        super(vinNumber, carSpeed, carSponsorePromo, carSpeedRate);
        this.driverName = driverName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }


}
