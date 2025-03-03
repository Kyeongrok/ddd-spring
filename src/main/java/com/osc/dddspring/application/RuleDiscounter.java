package com.osc.dddspring.application;

import com.osc.object.chapter05.Customer;
import com.osc.object.chapter08.Money;
import com.osc.dddspring.domain.OrderLine;

import java.util.List;

public interface RuleDiscounter {

    Money applyRules(Customer customer, List<OrderLine> orderLines);

}
