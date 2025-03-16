package dev.wolverine.drools.demo.model;

public class TaxiRide {
    private Boolean isNightSurcharge;
    private Long distanceInMile;

    public Boolean getIsNightSurcharge() {
        return this.isNightSurcharge;
    }

    public void setIsNightSurcharge(Boolean isNightSurcharge) {
        this.isNightSurcharge = isNightSurcharge;
    }

    public Long getDistanceInMile() {
        return this.distanceInMile;
    }

    public void setDistanceInMile(Long distanceInMile) {
        this.distanceInMile = distanceInMile;
    }

}
