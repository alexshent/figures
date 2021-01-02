package com.testmatick.alexshent.figures;

public class RightTriangle extends Figure {
    private static final int CATHETUS_A_MAX = 12;
    private static final int CATHETUS_B_MAX = 15;
    private float cathetusA;
    private float cathetusB;

    public RightTriangle(float cathetusA, float cathetusB, String color) {
        super.setName("right triangle");
        super.setColor(color);
        this.cathetusA = cathetusA;
        this.cathetusB = cathetusB;
    }
    
    public double calcHypotenuse() {
        return Math.sqrt(cathetusA * cathetusA + cathetusB * cathetusB);
    }
    
    @Override
    public double calcArea() {
        return cathetusA * cathetusB / 2;
    }

    @Override
    public String specialMethod() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("hypotenuse length = %f", this.calcHypotenuse()));
        return sb.toString();
    }
    
    public static int getCathetusAMax() {
        return CATHETUS_A_MAX;
    }
    
    public static int getCathetusBMax() {
        return CATHETUS_B_MAX;
    }
}
