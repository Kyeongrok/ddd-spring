package com.osc.object.chapter06;

import com.osc.object.chapter05.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
