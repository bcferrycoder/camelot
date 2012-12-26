package com.bcferrycoder.camelot;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: stackato
 * Date: 12/21/12
 * Time: 2:12 PM
 * Copyright 2012 John Wetherill
 */
public class Rainfall {
    private Date timestamp;
    private double[] location;
    private double rainfall;

    public Rainfall() {
        this(0, 0, 0);
    }

    public Rainfall(double lat, double lng, double rainfall) {
        setTimestamp(new Date());
        setLocation(new double[] {lat, lng});
        setRainfall(rainfall);
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public double[] getLocation() {
        return location;
    }

    public void setLocation(double[] location) {
        this.location = location;
    }

    public double getRainfall() {
        return rainfall;
    }

    public void setRainfall(double rainfall) {
        this.rainfall = rainfall;
    }
}

