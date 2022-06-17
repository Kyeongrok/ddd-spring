package com.osc.dddspring.domain;

public enum OrderState {

    // 주문 전, 결제 대기 중, 상품 준비 중, 주문 취소됨, 출고 완료됨, 배송 중, 배송 완료됨
    PAYMENT_WAITTING{
        public boolean isShippingChangeable() {
            return true;
        }
    },
    PREPARING {
        public boolean isShippingChangeable() {
            return true;
        }
    },
    SHIPPED, DELIVERING, DELIVERY_COMPLETED;

    public boolean isShippingChangeable() {
        return false;
    }
}
