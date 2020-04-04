package ru.uennar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class User {
    private String name;
    private EquiMaster equiMaster;
    private int shift;
    @Autowired
    public User(EquiMaster equiMaster){
        this.equiMaster = equiMaster;
        name = equiMaster.getName();
        shift = equiMaster.getShift();
    }
    @Override
    public String toString() {
        return "Пользователь " + name + "в смене " + shift + " обрабатывает оборудования " +
                "\n" + equiMaster.getEquiBrand(TypeEqui.getRandomTypeEqui());
    }
}
