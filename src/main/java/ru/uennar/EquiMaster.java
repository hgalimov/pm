package ru.uennar;

public class EquiMaster {
    Equi equi;

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

    public EquiMaster() {
    }

    public EquiMaster(Equi equi) {
        this.equi = equi;
    }

    public void setEqui(Equi equi) {
        this.equi = equi;
    }

    public void getEquiBrand(){
        System.out.println("Бренд выбранного оборудования: "+ equi.getBrand());
    }
}
