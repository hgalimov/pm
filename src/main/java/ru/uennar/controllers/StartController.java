package ru.uennar.controllers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.uennar.CompEqui;
import ru.uennar.SpringConfig;
import ru.uennar.User;
import ru.uennar.model.Equi;


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
    public String getEquiBrand(ModelMap model){
        AnnotationConfigApplicationContext context =
                 new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = context.getBean("user", User.class);
        model.addAttribute("msg", user.toString());
        return "/start/getEquiBrand";
    }
    @GetMapping("/addEquiPage")
    public String addEquiPage(ModelMap model){
        return "/start/addEqui";
    }
    @PostMapping("/addEqui")
    public String addEqui(@ModelAttribute Equi equi, ModelMap model){
        return "/start/addEqui";
    }
}
