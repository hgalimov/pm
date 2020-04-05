package ru.uennar;

import java.util.Random;

public enum TypeEqui {
    COMP,
    EL,
    MEAS,
    MECH;

    public static TypeEqui getRandomTypeEqui() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
