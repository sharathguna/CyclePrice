package com.sharath;

public class CalculateCost implements Runnable{
    private Thread t;
    private String threadName;
    Frame frame;
    HandleBar hb;
    Seating seat;
    Wheels wh;
    ChainAssembly chain;
    int totalCost ;

    CalculateCost() {

    }

    CalculateCost(String threadName){
        this.threadName = threadName;
        frame = new Frame(Frame.STEEL_FRAME);
        hb = new HandleBar(HandleBar.STEEL_BAR);
        seat = new Seating(Seating.PLASTIC_SEAT);
        wh = new Wheels(Wheels.STEEL_WHEEL);
        chain = new ChainAssembly(ChainAssembly.STEEL_CHAIN);
    }

    int getCycleCost() {
        return totalCost;
    }


    @Override
    public void run() {
        try {
            int frameCost = frame.start();
            int handleCost = hb.start();
            int seatCost = seat.start();
            int wheelCost = wh.start();
            int chainCost = chain.start();

            totalCost = frameCost + handleCost + seatCost + wheelCost + chainCost ;

        } catch (Exception e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
    }

    public void start(){
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}
