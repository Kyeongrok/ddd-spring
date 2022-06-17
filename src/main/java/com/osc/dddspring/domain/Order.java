package com.osc.dddspring.domain;

import java.util.List;

public class Order {
    private String orderNumber;
    private float totalAmount;
    private OrderState state;
    private ShippingInfo shippingInfo;
    private List<OrderLine> orderLines;

    private void verifyAtLeastOneOrMoreOrderLines(List<OrderLine> orderLines) {
        if (orderLines == null || orderLines.isEmpty()) {
            throw new IllegalArgumentException("no OrderLine");
        }
    }

    public Order(ShippingInfo shippingInfo, List<OrderLine> orderLines) {
        setShippingInfo(shippingInfo);
        setOrderLines(orderLines);
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        verifyAtLeastOneOrMoreOrderLines(orderLines);
        this.orderLines = orderLines;
        calculateTotalAmounts();
    }

    private void setShippingInfo(ShippingInfo shippingInfo) {
        if (shippingInfo == null) {
            throw new IllegalArgumentException("no ShippingInfo");
        }
        this.shippingInfo = shippingInfo;
    }

    private void calculateTotalAmounts() {
        double sum = orderLines.stream()
                .mapToDouble(x -> x.getAmounts().getValue())
                .sum();
        this.totalAmount = (float) sum;
    }

    public void changeShippingInfo(ShippingInfo newShippingInfo) {
        if (!state.isShippingChangeable()) {
            throw new IllegalStateException("can't change");
        }
    }

    public void cancel() {

    }


}
