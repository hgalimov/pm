package ru.uennar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;
    private EquiMaster equiMaster;
    @Autowired
    public User(EquiMaster equiMaster){
        this.equiMaster = equiMaster;
        name = "superAdmin";
    }
    @Override
    public String toString() {
        return "Пользователь " + name + " обрабатывает оборудования \n" + equiMaster.getEquiBrand(TypeEqui.COMP);
    }
}
