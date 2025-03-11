package com.osc.object.chapter11b;


import com.osc.object.chapter08.Money;
import com.osc.object.chapter11a.Call;
import com.osc.object.chapter11a.Phone;

public abstract class BasicPolicy implements RatePolicy {

    @Override
    public Money calculateFee(Phone phone) {

        Money result = Money.ZERO;

        for (Call call : phone.getCalls()) {
            result = result.plus(calculateCallFee(call));
        }
        return result;
    }

    protected abstract Money calculateCallFee(Call call);
}
