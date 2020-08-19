package com.sharath;

public class HandleBar implements Runnable {

    private int Cost;
    int handleType;
    static final int STEEL_BAR = 500;
    static final int IRON_BAR = 1000;

    HandleBar(int Type){
        this.handleType = Type;
    }
    @Override
    public void run() {
        calculateCost(handleType);
    }

    public int start() {
        run();
        return getCost();
    }

    void calculateCost(int handleType) {
        switch (handleType){
            case STEEL_BAR:
                Cost = STEEL_BAR;
                break;
            case IRON_BAR:
                Cost = IRON_BAR;
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
