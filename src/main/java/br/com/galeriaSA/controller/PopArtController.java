package br.com.galeriaSA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PopArtController {

    @GetMapping("/pesquisa/popArt")
    public String popArt(){
        return "pesquisa/popArt";
    }

}
