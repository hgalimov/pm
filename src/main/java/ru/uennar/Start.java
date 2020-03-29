package ru.uennar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        EquiBean equiBean = context.getBean("equiBean", EquiBean.class);
        System.out.println(equiBean.getName());
        context.close();
    }
}
