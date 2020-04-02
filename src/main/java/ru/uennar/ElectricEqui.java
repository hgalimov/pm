package ru.uennar;

public class ElectricEqui implements Equi{
    private ElectricEqui() {
    }

    public static ElectricEqui getElectricEqui(){
        return new ElectricEqui();
    }

    public void doInit(){
        System.out.println("Бин инициализировался");
    }
    public void doDestroy(){
        System.out.println("Бин удалился");
    }
    @Override
    public String getBrand() {
        return "Vitek";
    }

}
