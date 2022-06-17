package com.osc.dddspring.application;

import com.osc.dddspring.domain.Customer;
import com.osc.dddspring.domain.Money;
import com.osc.dddspring.domain.OrderLine;

import java.util.List;

public interface RuleDiscounter {

    Money applyRules(Customer customer, List<OrderLine> orderLines);

}
