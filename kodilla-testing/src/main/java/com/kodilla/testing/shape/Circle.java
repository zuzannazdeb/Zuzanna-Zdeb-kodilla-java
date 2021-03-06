package com.kodilla.testing.shape;

public class Circle implements Shape{
    private double radius;

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return 3.14*radius*radius;
    }
}
