package com.osc.object.chapter05;

import com.osc.object.chapter08.Money;

public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money money;

    public Reservation(Customer customer, Screening screening, Money money) {
        this.customer = customer;
        this.screening = screening;
    }
}
