package ru.uennar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        context.close();
    }
}
