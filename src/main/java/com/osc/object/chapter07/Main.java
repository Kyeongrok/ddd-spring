package com.osc.object.chapter07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "";
        float taxRate = getTaxRate();
        int pay = calculatePayFor(name, taxRate);
        describeResult();

    }

    private static void describeResult() {

    }

    private static int calculatePayFor(String name, float taxRate) {
        return 0;
    }

    private static float getTaxRate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("세율을 입력하세요(%): ");
        return sc.nextFloat();
    }
}
