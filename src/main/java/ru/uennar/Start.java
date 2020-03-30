package ru.uennar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        //MeasEqui equi = context.getBean("equiBean", MeasEqui.class);
        //EquiMaster equiMaster = new EquiMaster(equi);
        EquiMaster equiMaster = context.getBean("equiMaster", EquiMaster.class);
        equiMaster.getEquiBrand();
        context.close();
    }
}
