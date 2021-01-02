package com.testmatick.alexshent.figures;

public class Square extends Figure {
    private static final int SIDE_MAX = 10;
    private float side;

    public Square(float side, String color) {
        super.setName("square");
        super.setColor(color);
        this.side = side;
    }
    
    @Override
    public double calcArea() {
        return side * side;
    }

    @Override
    public String specialMethod() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("side length = %f", side));
        return sb.toString();
    }
    
    public static int getSideMax() {
        return SIDE_MAX;
    }
}
