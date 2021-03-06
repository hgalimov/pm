package ru.uennar.basic;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class CompEqui implements Equi {
    List<String> equiList = new ArrayList<>();

    public CompEqui() {
        equiList.add("Acer");
        equiList.add("HP");
        equiList.add("Bell");
    }

    @Override
    public List<String> getEquiList() {
        return equiList;
    }

    @Override
    public String getBrand(int idx) {
        return equiList.get(idx);
    }
}
