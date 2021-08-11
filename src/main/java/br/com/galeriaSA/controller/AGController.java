package br.com.galeriaSA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AGController {

    @GetMapping("/galeria/antigaGaleria")
    public String agale(){
        return "galeria/antigaGaleria";
    }

}
