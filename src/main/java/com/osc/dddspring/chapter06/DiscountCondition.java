package com.osc.dddspring.chapter06;

import com.osc.dddspring.domain.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
