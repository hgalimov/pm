package ru.uennar;

import org.springframework.stereotype.Component;

@Component
public class CompEqui implements Equi {
    @Override
    public String getBrand() {
        return "Acer";
    }
}
