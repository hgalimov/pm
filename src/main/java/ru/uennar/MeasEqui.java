package ru.uennar;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("measEqui")
@Scope("prototype")
public class MeasEqui implements Equi{
    List<String> equiList = new ArrayList<>();
    public MeasEqui() {
        equiList.add("Testo");
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
