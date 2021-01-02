package com.testmatick.alexshent.figures;

public abstract class Figure {
    private String name;
    private String color;
    
    public abstract double calcArea();
    public abstract String specialMethod();
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s%s%n", "figure name = ", getName()));
        sb.append(String.format("%s%f%n", "area = ", calcArea()));
        sb.append(String.format("%s%n", specialMethod()));
        sb.append(String.format("%s%s%n", "color = ", getColor()));
        return sb.toString();
    }
}
