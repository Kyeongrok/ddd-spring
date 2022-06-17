package com.osc.dddspring.application;

import com.osc.dddspring.domain.Order;
import com.osc.dddspring.domain.ShippingInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class CancelOrderService {

    @Transactional
    public void cancelOrder(String orderId) {
        Order order = new Order(new ShippingInfo(), new ArrayList<>());
        if (order == null) throw new IllegalArgumentException();
        order.cancel();
    }
}
