package ru.uennar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class EquiMaster {
    List<Equi> equiList;
    String str = "";

    @Autowired
    public EquiMaster(CompEqui compEqui, ElectricEqui electricEqui, MeasEqui measEqui) {
        equiList = new ArrayList<>();
        equiList.add(electricEqui);
        equiList.add(measEqui);
        equiList.add(compEqui);
    }

    public String getEquiBrand() {
        for (Equi equi : equiList
        ) {
            str+="Бренд выбранного оборудования: " + equi.getBrand() + " " + equi.toString() + '\n';
        }
        return str;
    }
}
