package com.practice.cucumber;

/**
 * Created by jaine03 on 15/01/17.
 */
public class Calculator {

    private double currentValue;

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public void add(Number number) {
        currentValue += number.doubleValue();
    }

    public void subtract(Number number) {
        currentValue -= number.doubleValue();
    }

}
