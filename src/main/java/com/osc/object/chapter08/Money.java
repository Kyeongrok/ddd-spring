package com.osc.object.chapter08;

import lombok.Getter;

@Getter
public class Money {
    public static final Money ZERO = Money.of(0);

    private static Money of(int i) {
        return new Money(i);
    }

    private int value;

    public Money(int value) {
        this.value = value;
    }

    public Money add(Money money) {
        return new Money(this.value + money.getValue());
    }

    public Money multiply(int multiplier) {
        return new Money(value * multiplier);
    }

    public Money times(double audienceCount) {
        return null;
    }

    public Money minus(Money money) {
        return null;
    }

    public Money plus(Object o) {
        return null;
    }
}
