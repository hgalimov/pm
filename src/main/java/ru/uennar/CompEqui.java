package ru.uennar;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompEqui implements Equi {
    public List<String> getEquiList() {
        return equiList;
    }

    List<String> equiList = new ArrayList<>();

    public CompEqui() {
        equiList.add("Acer");
        equiList.add("HP");
        equiList.add("Bell");
    }

    @Override
    public String getBrand(int idx) {
        return equiList.get(idx);
    }
}
