package com.osc.object.chapter06;

public class SequenceCondition implements DiscountCondition{
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return false;
    }
}
