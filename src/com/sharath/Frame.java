package com.sharath;

public class Frame implements Runnable {

    private int Cost;
    int frameType;
    static final int STEEL_FRAME = 500;
    static final int PREMIUM_FRAME = 1000;

    Frame(int Type){
        this.frameType = Type;
    }
    @Override
    public void run() {
        calculateCost(frameType);
    }

    public int start() {
        run();
        return getCost();
    }

    void calculateCost(int frameType) {
        switch (frameType){
            case STEEL_FRAME:
                Cost = STEEL_FRAME;
                break;
            case PREMIUM_FRAME:
                Cost = PREMIUM_FRAME;
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
