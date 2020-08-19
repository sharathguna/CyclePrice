package com.sharath;

public class Seating implements Runnable {

    private int Cost;
    int seatType;
    static final int PLASTIC_SEAT = 500;
    static final int LEATHER_SEAT = 1000;

    Seating(int Type){
        this.seatType = Type;
    }
    @Override
    public void run() {
        calculateCost(seatType);
    }

    public int start() {
        run();
        return getCost();
    }

    void calculateCost(int seatType) {
        switch (seatType){
            case PLASTIC_SEAT:
                Cost = PLASTIC_SEAT;
                break;
            case LEATHER_SEAT:
                Cost = LEATHER_SEAT;
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
