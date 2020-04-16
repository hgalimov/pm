package ru.uennar;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;



@Component
public class ElectricEqui implements Equi {
    List<String> equiList = new ArrayList<>();
    @PostConstruct
    public void init(){
        System.out.println("Бин электрооборудования инициализировался");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Бин электрооборудования удаляется");
    }

    public ElectricEqui() {
        equiList.add("Vitek");
        equiList.add("Bosch");
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
