package com.osc.object.chapter08;

import com.osc.object.chapter05.Screening;

public interface DiscountPolicy {
    Money calculate(Screening screening);

    Money calculateDiscountAmount(Screening screening);
}
