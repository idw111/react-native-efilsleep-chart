package com.reactlibrary.graphview.interfs;

/**
 * the base interface for the graphview data. you can use your own data models,
 * when they implement this interface.
 */
public interface GraphViewDataInterface {
    public double getX();

    public double getY();

    public int getLevel();
}
