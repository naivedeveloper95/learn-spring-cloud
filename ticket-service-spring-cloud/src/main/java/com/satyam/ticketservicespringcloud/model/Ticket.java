package com.satyam.ticketservicespringcloud.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ticketCode;
    private Integer numberOfTickets;
    private BigDecimal totalPrice;

    public Ticket(String ticketCode, Integer numberOfTickets, BigDecimal totalPrice) {
        this.ticketCode = ticketCode;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public Ticket() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(Integer numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }
}