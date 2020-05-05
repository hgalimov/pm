package ru.uennar.basic.controllers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.uennar.basic.SpringConfig;
import ru.uennar.basic.User;
import ru.uennar.basic.model.Equi;


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

   @RequestMapping(value = "/returnRaw", method = RequestMethod.GET,
            produces = "application/json; charset=utf-8")
    @ResponseBody
    public String returnRaw(ModelMap model){
        return "{testтест}";
    }
}
