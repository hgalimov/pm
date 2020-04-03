package ru.uennar;

import org.springframework.stereotype.Component;

@Component("measEqui")
public class MeasEqui implements Equi{
    @Override
    public String getBrand() {
        return "Testo";
    }
}
