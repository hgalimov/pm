package ru.uennar;

public class EquiMaster {
    Equi equi;

    public EquiMaster(Equi equi) {
        this.equi = equi;
    }
    public void getEquiBrand(){
        System.out.println("Brand this equi: "+ equi.getBrand());
    }
}
