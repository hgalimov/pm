package ru.uennar.basic.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Equi {
    private String id;
    private String name;
}
