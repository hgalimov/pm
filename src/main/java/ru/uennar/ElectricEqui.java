package ru.uennar;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ElectricEqui implements Equi {
    public List<String> getEquiList() {
        return equiList;
    }

    List<String> equiList = new ArrayList<>();

    public ElectricEqui() {
        equiList.add("Vitek");
        equiList.add("Bosch");
    }

    @Override
    public String getBrand(int idx) {
        return equiList.get(idx);
    }

}
