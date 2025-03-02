package com.osc.dddspring.application;

import com.osc.dddspring.domain.Order;
import com.osc.dddspring.domain.ShippingInfo;
import com.osc.dddspring.infra.CustomerRepository;

import java.util.ArrayList;

public class CancelOrderService {

    private final CustomerRepository customerRepository;

    public CancelOrderService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void cancelOrder(String orderId) {
        Order order = new Order(new ShippingInfo(), new ArrayList<>());
        if (order == null) throw new IllegalArgumentException();
        order.cancel();
    }
}
