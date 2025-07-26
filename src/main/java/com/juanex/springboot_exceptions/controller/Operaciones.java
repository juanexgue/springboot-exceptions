package com.juanex.springboot_exceptions.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/division")
public class Operaciones {

    @GetMapping
    public String Divide() {
        int valor = 20 / 0;
        return "resultado: " + valor;
    }

}
