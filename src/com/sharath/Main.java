package com.sharath;

public class Main {

    public static void main(String[] args) {

        CalculateCost cost = new CalculateCost("Cycle");
        cost.start();
        System.out.println("The Cost of the cycle is "+ cost.getCycleCost());
    }
}
