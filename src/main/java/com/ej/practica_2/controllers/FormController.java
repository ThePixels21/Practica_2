package com.ej.practica_2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ej.practica_2.model.Usuario;

import jakarta.validation.Valid;

@Controller
public class FormController {
    
    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("usuario", new Usuario());
        model.addAttribute("titulo", "Formulario");
        return "form";
    }

    @PostMapping("/form")
    public String respuesta(@Valid Usuario usuario, BindingResult result, Model model) {
        if(result.hasErrors()) {
            model.addAttribute("titulo", "Corregir errores");
            return "form";
        }
        model.addAttribute("titulo", "Datos");
        return "respuesta";
    }
}
