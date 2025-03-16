package dev.wolverine.drools.demo.model;

public class Fare {
    private Long nightSurcharge;
    private Long rideFare;

    public Long getNightSurcharge() {
        return this.nightSurcharge;
    }

    public void setNightSurcharge(Long nightSurcharge) {
        this.nightSurcharge = nightSurcharge;
    }

    public Long getRideFare() {
        return this.rideFare;
    }

    public void setRideFare(Long rideFare) {
        this.rideFare = rideFare;
    }

    public Long getTotalFare() {
        return nightSurcharge + rideFare;
    }
}
