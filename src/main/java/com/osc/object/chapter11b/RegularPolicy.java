package com.osc.object.chapter11b;

import com.osc.object.chapter08.Money;
import com.osc.object.chapter11a.Call;

public class RegularPolicy extends BasicPolicy {
    @Override
    protected Money calculateCallFee(Call call) {
        return null;
    }
}
