package com.osc.object.chapter07;

public class Employee {
    private String name;
    private float basePay;
    private boolean hourly;
    private int timeCard;

    public float calculatePay(float taxRate) {
        if(hourly) {
            return calculateHourlyPay(taxRate);
        } else {
            return calculateSalariedPay(taxRate);
        }
    }

    private float calculateSalariedPay(float taxRate) {
        return basePay - (basePay * taxRate);
    }

    private float calculateHourlyPay(float taxRate) {
        return (basePay * timeCard) - (basePay * timeCard) * taxRate;
    }

}
