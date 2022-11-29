package com.cinematicketsys.purchaseapi.model;

import java.util.UUID;

import com.cinematicketsys.purchaseapi.common.TicketStatus;
import com.cinematicketsys.purchaseapi.common.TicketType;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Id;

public class Ticket{
    @Id
    final UUID id;

    @Column(name="ticketType")
    TicketType ticketType; //TicketType

    @Column(name="price")
    Double price;
    @Column(name="")
    int seatNo;

    @Column(name="movieTime")
    DateTime movieTime;

    @Column(name="ticketStatus")
    TicketStatus ticketStatus; //TicketStatus
    Movie movie;

    public Ticket(UUID id, TicketType ticketType, Double price, int seatNo, DateTime movieTime, TicketStatus ticketStatus) {
        this.id = id;
        this.ticketType = ticketType;
        this.price = price;
        this.seatNo = seatNo;
        this.movieTime = movieTime;
        this.ticketStatus = ticketStatus;
    }

    public UUID getId() {
        return id;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public DateTime getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(DateTime movieTime) {
        this.movieTime = movieTime;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public void addPrice(){
        System.out.println("The price is increased.");
    }


}
