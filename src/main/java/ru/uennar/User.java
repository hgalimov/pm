package ru.uennar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class User {
    private EquiMaster equiMaster;

    @Value("${equiMaster.userName}")
    private String name;
    @Value("${equiMaster.shift}")
    private String shift;

    @Autowired
    public User(EquiMaster equiMaster){
        this.equiMaster = equiMaster;
    }
    @Override
    public String toString() {
        return "Пользователь " + name + " в смене " + shift + " обрабатывает оборудования " +
                "\n" + equiMaster.getEquiBrand(/*TypeEqui.COMP*/TypeEqui.getRandomTypeEqui());
    }
    public String equiList(){
        return equiMaster.getEquiList();
    }
}
