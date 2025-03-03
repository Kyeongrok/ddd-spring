package com.osc.object.chapter04;

import com.osc.object.chapter05.Customer;
import com.osc.object.chapter05.Reservation;
import com.osc.object.chapter05.Screening;
import com.osc.object.chapter08.Movie;

public class ReservationAgency {
    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {

        Movie movie = screening.getMovie();

        boolean discountable = false;

        return new Reservation(customer, screening, movie.calculateMovieFee(screening));
    }

}
