package br.com.galeriaSA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GaleriaController {

    @GetMapping("/galeria/galeria")
    public String galeria(){
        return "/galeria/galeria";
    }

     /*@GetMapping("/cargo/list")
    public String list(Model model){
        model.addAttribute("cargos << (OBRAS) >> ", cargoService.findAll());
        return "cargo/list";
    }*/
}
