package ru.uennar;

import java.util.ArrayList;
import java.util.List;

public class EquiMaster {


    List<Equi> equiList;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    String userName;
    int shift;

    public void doInit(){
        System.out.println("Бин equi-master инициализировался");
    }
    public void doDestroy(){
        System.out.println("Бин equi-master удалился");
    }
    public EquiMaster() {
        equiList = new ArrayList<>();
    }

   /* public EquiMaster(List<Equi> equiList) {
        this.equiList = equiList;
    }*/

    public void setEquiList(List<Equi> equiList) {
        this.equiList = equiList;
    }

    public void getEquiBrand(){
        for (Equi equi:equiList
             ) {
            System.out.println("Бренд выбранного оборудования: "+ equi.getBrand());
        }

    }
}
