package com.sharath;

public class ChainAssembly implements Runnable {

    private int Cost;
    int chainType;
    static final int STEEL_CHAIN = 500;
    static final int PREMIUM_CHAIN = 1000;

    ChainAssembly(int Type){
        this.chainType = Type;
    }
    @Override
    public void run() {
        calculateCost(chainType);
    }

    public int start() {
        run();
        return getCost();
    }

    void calculateCost(int chainType) {
        switch (chainType){
            case STEEL_CHAIN:
                Cost = STEEL_CHAIN;
                break;
            case PREMIUM_CHAIN:
                Cost = PREMIUM_CHAIN;
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
