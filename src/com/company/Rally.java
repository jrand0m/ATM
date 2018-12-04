package com.company;

public class Rally extends Sporty{
    String roadCoating;

    public String getRoadCoating() {
        return roadCoating;
    }

    public void setRoadCoating(String roadCoating) {
        this.roadCoating = roadCoating;
    }

    public Rally(long vinNumber, int carSpeed, String carSponsorePromo, int carSpeedRate) {
        super(vinNumber, carSpeed, carSponsorePromo, carSpeedRate);
    }
}
