package com.cinematicketsys.purchaseapi.model;

public class Venue {
    final int venueNo;
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
