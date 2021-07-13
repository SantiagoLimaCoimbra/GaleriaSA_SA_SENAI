package br.com.galeriaSA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArteUrbanaController {

    @GetMapping("/pesquisa/arteUrbana")
    public String arteUr(){
        return "pesquisa/arteUrbana";
    }

}
