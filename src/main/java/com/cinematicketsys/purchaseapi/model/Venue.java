package com.cinematicketsys.purchaseapi.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Venue {
    @Id
    final int venueNo;

    @Column(name="numOfSeat")
    int numOfSeat;

    public Venue(int venueNo, int numOfSeat) {
        this.venueNo = venueNo;
        this.numOfSeat = numOfSeat;
    }

    public int getVenueNo() {
        return venueNo;
    }

    public int getNumOfSeat() {
        return numOfSeat;
    }

    public void setNumOfSeat(int numOfSeat) {
        this.numOfSeat = numOfSeat;
    }
}
