package com.osc.dddspring.chapter06;

import com.osc.dddspring.domain.Screening;

public class SequenceCondition implements DiscountCondition{
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return false;
    }
}
