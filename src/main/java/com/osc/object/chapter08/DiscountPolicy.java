package com.osc.object.chapter08;

import com.osc.object.chapter06.Screening;

public interface DiscountPolicy {
    Money calculate(Screening screening);
}
