package com.sharath;

public class Wheels implements Runnable {

    private int Cost;
    int wheelType;
    static final int STEEL_WHEEL = 500;
    static final int PREMIUM_WHEEL = 1000;

    Wheels(int Type){
        this.wheelType = Type;
    }
    @Override
    public void run() {
        calculateCost(wheelType);
    }

    public int start() {
        run();
        return getCost();
    }

    void calculateCost(int wheelType) {
        switch (wheelType){
            case STEEL_WHEEL:
                Cost = STEEL_WHEEL;
                break;
            case PREMIUM_WHEEL:
                Cost = PREMIUM_WHEEL;
                break;
            default:
                Cost = 0;
        }
    }

    void setCost(int cost) {
        Cost = cost;
    }

    int getCost() {
        return Cost;
    }

}
