package com.osc.object.chapter08;

import com.osc.object.chapter05.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);

    boolean isDiscountable(Screening screening);
}
