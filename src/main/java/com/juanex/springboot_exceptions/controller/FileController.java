package com.juanex.springboot_exceptions.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.juanex.springboot_exceptions.service.FileContent;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/archivo")
public class FileController {

    private final FileContent contenido;

    public FileController(FileContent contenido) {
        this.contenido = contenido;
    }

    @GetMapping("/lectura")
    public ResponseEntity<String> Lectura(@RequestParam String filepath) {
        try {
            String elArchivo = contenido.LecturaArchivo(filepath);
            return ResponseEntity.ok(elArchivo);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error de lectura del archivo" + e);
        }
    }

}
