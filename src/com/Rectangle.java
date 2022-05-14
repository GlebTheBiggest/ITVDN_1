package com;

public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double areaCalculator() {
        return sideA * sideB;
    }

    public double perimeterCalculator() {
        return (sideA + sideB) * 2;
    }

}
