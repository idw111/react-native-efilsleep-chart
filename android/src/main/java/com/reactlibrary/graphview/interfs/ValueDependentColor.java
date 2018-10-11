package com.reactlibrary.graphview.interfs;

/**
 * you can change the color depending on the value. takes only effect in
 * BarGraphView
 */
public interface ValueDependentColor {
    public int get(GraphViewDataInterface data);
}
