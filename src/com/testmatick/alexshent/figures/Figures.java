package com.testmatick.alexshent.figures;

import java.util.concurrent.ThreadLocalRandom;

public enum Figures {
    SQUARE, RIGHT_TRIANGLE, CIRCLE, TRAPEZIUM;
    
    public static Figures generateRandomFigure() {
        Figures[] values = Figures.values();
        int randomIndex = ThreadLocalRandom.current().nextInt(0, values.length);
        return values[randomIndex];
    }
}
