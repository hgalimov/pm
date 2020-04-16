package ru.uennar.controllers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.uennar.SpringConfig;
import ru.uennar.User;


@Controller
@RequestMapping("/start")
public class StartController {

    @GetMapping("/getEquiList")
    public String getInfo(ModelMap model){
        AnnotationConfigApplicationContext context =
                 new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = context.getBean("user", User.class);
        model.addAttribute("equis", user.equiList());
        return "/start/getEquiList";
    }
    @GetMapping("/getEquiBrand")
    public String start(ModelMap model){
        AnnotationConfigApplicationContext context =
                 new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = context.getBean("user", User.class);
        model.addAttribute("msg", user.toString());
        return "/start/getEquiBrand";
    }
}
