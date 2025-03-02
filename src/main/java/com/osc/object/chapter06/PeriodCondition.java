package com.osc.object.chapter06;

public class PeriodCondition implements DiscountCondition {
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return false;
    }
}
