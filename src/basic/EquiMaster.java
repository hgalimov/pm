package ru.uennar.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class EquiMaster {

    private Equi compEqui;
    private Equi measEqui;
    private Equi electricEqui;

    String str = "";

    @Autowired
    public EquiMaster(@Qualifier("compEqui") Equi cmpEqui,
                      @Qualifier("electricEqui") Equi elEqui,
                      @Qualifier("measEqui") Equi msEqui) {
        this.compEqui = cmpEqui;
        this.measEqui = msEqui;
        this.electricEqui = elEqui;
    }

    public String getEquiList() {
        String equis = "";
        List<String> brands = new ArrayList<>();
        for (String equi : compEqui.getEquiList()
        ) {
            equis += equi + " ";
        }
        for (String equi : electricEqui.getEquiList()
        ) {
            equis += equi + " ";
        }
        for (String equi : measEqui.getEquiList()
        ) {
            equis += equi + " ";
        }
        return equis.trim();
    }

    public String getEquiBrand(TypeEqui typeEqui) {
        List<String> equiList = new ArrayList<>();

        switch (typeEqui) {
            case EL:
                equiList = electricEqui.getEquiList();
                break;
            case COMP:
                equiList = compEqui.getEquiList();
                break;
            case MEAS:
                equiList = measEqui.getEquiList();
                break;
        }
        Random random = new Random();
        int idx = random.nextInt(equiList.size());
        switch (typeEqui) {
            case EL:
                str += "Бренд выбранного оборудования: " + electricEqui.getBrand(idx) + " " +
                        electricEqui.toString() + '\n';
                break;
            case COMP:
                str += "Бренд выбранного оборудования: " + compEqui.getBrand(idx) + " " +
                        compEqui.toString() + '\n';
                break;
            case MEAS:
                str += "Бренд выбранного оборудования: " + measEqui.getBrand(idx) + " " +
                        measEqui.toString() + '\n';
                break;
        }
        return str;
    }
}
