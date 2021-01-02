package com.testmatick.alexshent.figures;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class FigureFactory {
    private static final int FIGURES_MIN = 1;
    private static final int FIGURES_MAX = 10;

    private static final String[] COLORS = { "blue", "green", "red", "yellow" };

    public List<Figure> generateFigures() {
        List<Figure> figures = new ArrayList<>();
        int figuresNumber = ThreadLocalRandom.current().nextInt(FIGURES_MIN, FIGURES_MAX + 1);

        for (int i = 0; i < figuresNumber; i++) {
            Figures randomFigure = Figures.generateRandomFigure();
            Figure figure = null;

            switch (randomFigure) {
            case SQUARE:
                figure = createRandomSquare();
                break;

            case RIGHT_TRIANGLE:
                figure = createRandomTriangle();
                break;

            case CIRCLE:
                figure = createRandomCircle();
                break;

            case TRAPEZIUM:
                figure = createRandomTrapezium();
                break;
            default:
                break;
            }

            figures.add(figure);
        }

        return figures;
    }

    private String randomColor() {
        int colorIndex = ThreadLocalRandom.current().nextInt(0, COLORS.length);
        return COLORS[colorIndex];
    }

    public Square createRandomSquare() {
        int side = ThreadLocalRandom.current().nextInt(1, Square.getSideMax() + 1);
        return new Square(side, randomColor());
    }

    public RightTriangle createRandomTriangle() {
        int cathetusA = ThreadLocalRandom.current().nextInt(1, RightTriangle.getCathetusAMax() + 1);
        int cathetusB = ThreadLocalRandom.current().nextInt(1, RightTriangle.getCathetusBMax() + 1);
        return new RightTriangle(cathetusA, cathetusB, randomColor());
    }

    public Circle createRandomCircle() {
        int radius = ThreadLocalRandom.current().nextInt(1, Circle.getRadiusMax() + 1);
        return new Circle(radius, randomColor());
    }

    public Trapezium createRandomTrapezium() {
        int sideA = ThreadLocalRandom.current().nextInt(1, Trapezium.getSideAMax() + 1);
        int sideB = ThreadLocalRandom.current().nextInt(1, Trapezium.getSideBMax() + 1);
        int height = ThreadLocalRandom.current().nextInt(1, Trapezium.getHeightMax() + 1);
        return new Trapezium(sideA, sideB, height, randomColor());
    }
}
