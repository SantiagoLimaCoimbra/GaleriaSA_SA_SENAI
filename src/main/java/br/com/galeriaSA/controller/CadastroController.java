package br.com.galeriaSA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CadastroController {

    @GetMapping("/galeria/cadastro")
    public String cadastr(){
        return "/galeria/cadastro";
    }

}
