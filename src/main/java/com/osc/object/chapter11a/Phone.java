package com.osc.object.chapter11a;

import com.osc.object.chapter08.Money;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class Phone {
    private List<Call> calls = new ArrayList<>();

    public Money calculateFee() {
        Money result = Money.ZERO;
        for (Call call : calls) {
            result = result.plus(calculateCallFee(call));
        }
        return result;
    }


    protected abstract Money calculateCallFee(Call call);
    protected abstract Money afterCalculated(Money fee);
}
