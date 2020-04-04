package ru.uennar;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("measEqui")
public class MeasEqui implements Equi{
    public List<String> getEquiList() {
        return equiList;
    }

    List<String> equiList = new ArrayList<>();

    public MeasEqui() {
        equiList.add("Testo");
    }

    @Override
    public String getBrand(int idx) {
        return equiList.get(idx);
    }
}
