package ru.uennar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.uennar.model.Equi;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/start")
public class StartController {


    @GetMapping("/getEquiList")
    public String getInfo(ModelMap model){
        Equi equi1 = new Equi("1", "Equi1") ;
        Equi equi2 = new Equi("1", "Equi2") ;
        List<Equi> equis = new ArrayList<>();
        equis.add(equi1);
        equis.add(equi2);
        model.addAttribute("equis", equis);
        return "/start/getEquiList";
    }

   @RequestMapping(value = "/returnRaw", method = RequestMethod.GET,
            produces = "application/json; charset=utf-8")
    @ResponseBody
    public String returnRaw(ModelMap model){
       Equi equi1 = new Equi("1", "Equi1") ;
       Equi equi2 = new Equi("1", "Equi2") ;
       List<Equi> equis = new ArrayList<>();
       equis.add(equi1);
       equis.add(equi2);

        return equi1.getId() + "-" + equi1.getName() + " "
                + equi2.getId() + "-" + equi2.getName();

    }
}
