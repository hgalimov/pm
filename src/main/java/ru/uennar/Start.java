package ru.uennar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        //MeasEqui equi = context.getBean("equiBean", MeasEqui.class);
        //EquiMaster equiMaster = new EquiMaster(equi);
        EquiMaster equiMaster1 = context.getBean("equiMaster", EquiMaster.class);
        EquiMaster equiMaster2 = context.getBean("equiMaster", EquiMaster.class);
        System.out.println(equiMaster1 == equiMaster2);
        equiMaster1.getEquiBrand();
        equiMaster2.setUserName("superAdmin");
        equiMaster2.setShift(2);
        System.out.println("Пользователи, которые обрабатывают оборудования: " + '\n' +
                equiMaster1.getUserName() + ". Смена: " + equiMaster1.getShift() + '\n' +
                equiMaster2.getUserName() + ". Смена: " + equiMaster2.getShift());
        context.close();
    }
}
