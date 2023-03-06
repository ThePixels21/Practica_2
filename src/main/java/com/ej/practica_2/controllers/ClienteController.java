package com.ej.practica_2.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ej.practica_2.model.Producto;
import com.ej.practica_2.model.Usuario;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
    @GetMapping({ "/", "" })
    public String cliente(Model model) {
        model.addAttribute("titulo", "Cliente");
        model.addAttribute("cliente", new Usuario("Mariana", "Orrego", "mariana@gmail.com", "1234"));
        return "cliente/cliente";
    }

    @ModelAttribute("productos")
    public List<Producto> getProductos() {
        List<Producto> productos = Arrays.asList(
                new Producto("Laptop Lenovo", "Buen estado", 2500000),
                new Producto("Laptop HP", "Buen estado", 1500000),
                new Producto("Laptop Samsung", "Buen estado", 2999000),
                new Producto("Laptop Asus", "Buen estado", 5600000),
                new Producto("Laptop Acer", "Buen estado", 479000));
        return productos;
    }
}
