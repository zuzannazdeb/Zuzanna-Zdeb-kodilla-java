package com.kodilla.testing.shape;

public class Triangle  implements Shape{
    private double baseLength;
    private double height;
    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return baseLength*height/2;
    }
}
