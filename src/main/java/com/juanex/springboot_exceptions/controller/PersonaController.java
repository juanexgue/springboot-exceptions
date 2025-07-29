package com.juanex.springboot_exceptions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juanex.springboot_exceptions.entidades.Persona;
import com.juanex.springboot_exceptions.repositorios.Repo_Persona;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {

    @Autowired
    private Repo_Persona repositorio;

    @GetMapping
    public List<Persona> Consulta() {
        return (List<Persona>) repositorio.findAll();
    }

}
