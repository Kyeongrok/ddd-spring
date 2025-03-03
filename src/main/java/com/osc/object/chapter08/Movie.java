package com.osc.object.chapter08;

import com.osc.object.chapter05.Screening;

import javax.management.Query;
import java.time.Duration;
import java.util.List;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition> discountConditions;

    public Money calculateMovieFee(Screening screening) {

        return null;
    }

    private boolean isDiscountable(Screening screening) {
        return discountConditions.stream()
                .anyMatch(condition -> condition.isSatisfiedBy(screening));
    }
}
