package dev.java10x.cadastrodeninjas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boasvindas")
public class NinjaController {

    @GetMapping
    public String boasvindas () {
        return "Essa é uma mensagem de boas vindas.";
    }
}
