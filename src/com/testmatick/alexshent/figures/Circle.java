package com.testmatick.alexshent.figures;

public class Circle extends Figure {
    private static final int RADIUS_MAX = 32;
    private float radius;
    
    public Circle(float radius, String color) {
        super.setName("circle");
        super.setColor(color);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String specialMethod() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("radius length = %f", radius));
        return sb.toString();
    }

    public static int getRadiusMax() {
        return RADIUS_MAX;
    }
}
