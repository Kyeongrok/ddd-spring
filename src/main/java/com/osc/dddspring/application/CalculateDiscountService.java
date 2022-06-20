package com.osc.dddspring.application;

import com.osc.dddspring.domain.Customer;
import com.osc.dddspring.domain.Money;
import com.osc.dddspring.domain.OrderLine;
import com.osc.dddspring.exceptions.NoCustomerException;
import com.osc.dddspring.infra.CustomerRepository;

import java.util.List;
import java.util.Optional;

public class CalculateDiscountService {
    private final RuleDiscounter ruleDiscounter;
    private final CustomerRepository customerRepository;


    public CalculateDiscountService(CustomerRepository customerRepository, RuleDiscounter ruleDiscounter) {
        this.ruleDiscounter = ruleDiscounter;
        this.customerRepository = customerRepository;
    }

    public Money calculateDiscount(List<OrderLine> orderLines, String customerId) throws NoCustomerException {
        Customer customer = findCustomer(customerId);
        return null;
    }

    private Customer findCustomer(String customerId) throws NoCustomerException {
        Optional<Customer> customer = customerRepository.findById(customerId);
        if (customer.isEmpty()) throw new NoCustomerException();
        return customer.get();
    }
}
