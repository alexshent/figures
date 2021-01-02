package com.testmatick.alexshent.figures;

import java.util.List;

public class Demo {
     
    public static void main(String[] args) {
        FigureFactory factory = new FigureFactory();
        List<Figure> figures = factory.generateFigures();
        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }
    }

}
