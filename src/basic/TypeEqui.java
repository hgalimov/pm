package ru.uennar.basic;

import java.util.Random;

public enum TypeEqui {
    COMP,
    EL,
    MEAS;

    public static TypeEqui getRandomTypeEqui() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
