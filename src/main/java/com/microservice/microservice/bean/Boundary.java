package com.microservice.microservice.bean;

public class Boundary {

    private int minimum;
    private int maximum;

    public Boundary(int minimum, int maximum) {
    }


    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }


}
