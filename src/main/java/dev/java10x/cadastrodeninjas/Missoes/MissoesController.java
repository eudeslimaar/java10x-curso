package dev.java10x.cadastrodeninjas.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    @GetMapping
    public String missoes() {
        return "Missões";
    }
}
