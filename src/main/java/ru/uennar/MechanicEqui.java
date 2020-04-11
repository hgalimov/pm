package ru.uennar;

import java.util.List;

public class MechanicEqui implements Equi {
    @Override
    public String getBrand(int idx) {
        return "WALDRICH SIEGEN";
    }

    @Override
    public List<String> getEquiList() {
        return null;
    }
}
