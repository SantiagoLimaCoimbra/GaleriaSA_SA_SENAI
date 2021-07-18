package br.com.galeriaSA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CadastroController {

    @GetMapping("/galeria/cadastro")
    public String cadastr(){
        return "/galeria/cadastro";
    }

    /*@GetMapping("/cargo/add")
    public String add(Model model){
        model.addAttribute("cargo", new Cargo());
        return "cargo/add";
    }*/
}
