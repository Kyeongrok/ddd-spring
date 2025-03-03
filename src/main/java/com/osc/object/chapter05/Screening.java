package com.osc.object.chapter05;

import com.osc.object.chapter08.Money;
import com.osc.object.chapter08.Movie;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount));
    }

    // Movie에 calculateMovieFee()라는 메세지 전송을 통해 협력 한다.
    public Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }

    public LocalDateTime getWhenScreened() {
        return null;
    }

    public int getSequence() {
        return 0;
    }
}
