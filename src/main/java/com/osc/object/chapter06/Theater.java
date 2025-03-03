package com.osc.object.chapter06;

public class Theater {
    private TicketSeller ticketSeller;

    public void enter(Audience audience) {
        Ticket ticket = ticketSeller.getTicketOffice().getTicket();

    }
}
