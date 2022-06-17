package com.osc.dddspring.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderLine {
    private Product product;
    private Money price;
    private int quantity;
    private Money amounts;

    public OrderLine(Product product, Money price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.amounts = calculateAmounts();
    }

    public Money calculateAmounts() {
        return price.multiply(quantity);
    }
}
