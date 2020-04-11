package ru.uennar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class EquiMaster {

    @Value("${equiMaster.userName}")
    private String name;
    @Value("${equiMaster.shift}")
    private String shift;

    private Equi compEqui;
    private Equi compEqui2;
    private Equi measEqui;
    private Equi measEqui2;
    private Equi electricEqui;
    private Equi mechanicEqui;

    List<Equi> equiList1 = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getShift() {
        return shift;
    }

    String str = "";

    @Autowired
    public EquiMaster(@Qualifier("compEqui") Equi cmpEqui, @Qualifier("measEqui") Equi msEqui,
                      @Qualifier("electricEqui") Equi elEqui, @Qualifier("compEqui") Equi compEqui2,
                      @Qualifier("measEqui") Equi msEqui2) {
        this.compEqui = cmpEqui;
        this.measEqui = msEqui;
        this.electricEqui = elEqui;
        this.compEqui2 = compEqui2;
        this.measEqui2 = msEqui2;
        equiList1.add(this.compEqui);
        equiList1.add(this.measEqui);
    }

   /* public EquiMaster() {
    }

    public EquiMaster(MechanicEqui mechanicEqui) {
        this.mechanicEqui = mechanicEqui;
    }*/

    public String getEquiBrand(TypeEqui typeEqui) {
        List<String> equiList = new ArrayList<>();

        switch (typeEqui) {
            case EL:
                equiList = ((ElectricEqui) electricEqui).getEquiList();
                break;
            case COMP:
                equiList = ((CompEqui) compEqui).getEquiList();
                break;
            case MEAS:
                equiList = ((MeasEqui) measEqui).getEquiList();
                break;
            case MECH:
                return mechanicEqui.getBrand(0);
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
                        compEqui.toString() + " " + compEqui2.toString() + '\n';
                break;
            case MEAS:
                str += "Бренд выбранного оборудования: " + measEqui.getBrand(idx) + " " +
                        measEqui.toString() + " " + measEqui2.toString() + '\n';
                break;
        }
        return str;
    }

    public String getEquiList() {
        String equis = "";
        List<String> brands = new ArrayList<>();
        for (Equi equi : equiList1
        ) {
            brands = equi.getEquiList();
            for (String brand: brands
                 ) {equis += brand + " ";

            }
        }
        return equis.trim();
    }

    public void addEqui() {
        List<String> brands = new ArrayList<>();
        for (Equi equi : equiList1
        ) {
            equi.getEquiList().add("TestПервый");
        }
    }
}
