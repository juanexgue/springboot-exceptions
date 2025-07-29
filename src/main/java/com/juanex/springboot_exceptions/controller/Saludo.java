package com.juanex.springboot_exceptions.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping
public class Saludo {

    @GetMapping("/saludo")
    public String Saludar() throws InterruptedException {
        Thread.sleep(7000);
        return "Saludos a todos";
    }

}
