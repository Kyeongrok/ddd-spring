package com.osc.object.chapter08;

import lombok.Getter;

@Getter
public class Money {
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

    public Money times(int audienceCount) {
        return null;
    }
}
