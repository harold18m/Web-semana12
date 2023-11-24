package com.tecsup.lab12.controller;

import com.tecsup.lab12.DTO.formularioDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controladorFormulario {
    @GetMapping("/formularioRegistro")
    public String envioFormulario(Model model){
        model.addAttribute("form",new formularioDTO());
        return "formulario";
    }
}
