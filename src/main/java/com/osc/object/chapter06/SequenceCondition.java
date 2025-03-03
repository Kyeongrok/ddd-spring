package com.osc.object.chapter06;

import com.osc.object.chapter05.Screening;

public class SequenceCondition implements DiscountCondition{
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return false;
    }
}
