package com.osc.object.chapter11b;

import com.osc.object.chapter08.Money;
import com.osc.object.chapter11a.Phone;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
