package br.com.galeriaSA.controller;

import br.com.galeriaSA.model.Obra;
import br.com.galeriaSA.repository.ObraRepository;
import br.com.galeriaSA.service.ObraService;
import br.com.galeriaSA.service.ObraServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class ObraController {

    @Autowired
    ObraServiceImple obraService;

    @GetMapping("/galeria/galeria")
    public String galeria(Model model){
        model.addAttribute("obras", obraService.findAll());
        return "/galeria/galeria";
    }

    @GetMapping("/galeria/cadastro")
    public String add(Model model){
        model.addAttribute("obra", new Obra());
        return "/galeria/cadastro";
    }

    @PostMapping("/obra/save")
    public String save(Obra obra, Model model){

        String msgErro = obraService.validarObra(obra);
        if(msgErro != null){
            model.addAttribute("obra", obra);
            model.addAttribute("erro", true);
            model.addAttribute("erroMsg", msgErro);
            if(obra.getId() == null) return "galeria/cadastro";
            else return "galeria/editarCadastro";
        }

        if(obraService.save(obra)){
            return "redirect:/galeria/galeria";
        } else {
            model.addAttribute("obra", obra);
            return "galeria/cadastro";
        }

    }


    @GetMapping("/galeria/editarCadastro/{id}")
    public String edit(@PathVariable long id, Model model){
        model.addAttribute("obra", obraService.findById(id));
        return "galeria/editarCadastro";
    }

    @GetMapping("/obra/delete/{id}")
    public String delete(@PathVariable long id){

        if(obraService.deleteById(id)){
            return "redirect:/galeria/galeria";
        } else {
            return "galeria/galeria";
        }
    }

}
