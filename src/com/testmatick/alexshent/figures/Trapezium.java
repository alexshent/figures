package com.testmatick.alexshent.figures;

public class Trapezium extends Figure {
    private static final int SIDE_A_MAX = 32;
    private static final int SIDE_B_MAX = 32;
    private static final int HEIGHT_MAX = 11;
    private float sideA;
    private float sideB;
    private float height;
    
    public Trapezium(float sideA, float sideB, float height, String color) {
        super.setName("trapezium");
        super.setColor(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }
    
    @Override
    public double calcArea() {
        return (sideA + sideB) / 2 * height;
    }

    @Override
    public String specialMethod() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("height = %f", height));
        return sb.toString();
    }

    public static int getSideAMax() {
        return SIDE_A_MAX;
    }
    
    public static int getSideBMax() {
        return SIDE_B_MAX;
    }
    
    public static int getHeightMax() {
        return HEIGHT_MAX;
    }
}
