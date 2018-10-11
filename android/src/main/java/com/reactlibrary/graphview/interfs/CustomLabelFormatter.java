package com.reactlibrary.graphview.interfs;

/**
 * if you want to show different labels, you can use this label formatter. As
 * Input you get the raw value (x or y) and you return a String that will be
 * displayed. {@code graphView.setCustomLabelFormatter(new
 * CustomLabelFormatter() public String formatLabel(double value, boolean
 * isValueX) { if (isValueX) { if (value < 5) { return "small"; } else if (value
 * < 15) { return "middle"; } else { return "big"; } } return null; // let
 * graphview generate Y-axis label for us } }); }
 */
public interface CustomLabelFormatter {

    /**
     * will be called when the labels were generated
     *
     * @param value
     *            the raw input value (x or y)
     * @param isValueX
     *            true if value is a x-value, false if otherwise
     * @return the string that will be displayed. return null if you want
     *         graphview to generate the label for you.
     */
    String formatLabel(double value, boolean isValueX);

}
