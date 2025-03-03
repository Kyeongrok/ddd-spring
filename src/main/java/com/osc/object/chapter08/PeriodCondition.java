package com.osc.object.chapter08;

import com.osc.object.chapter05.Screening;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class PeriodCondition implements DiscountCondition{

    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return false;
    }

    @Override
    public boolean isDiscountable(Screening screening) {
        return false;
    }
}
