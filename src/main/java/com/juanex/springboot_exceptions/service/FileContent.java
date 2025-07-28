package com.juanex.springboot_exceptions.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.stereotype.Service;

@Service
public class FileContent {

    public String LecturaArchivo(String filepath) {
        try {
            Path ruta = Paths.get(filepath);
            return Files.readString(ruta);
        } catch (Exception e) {
            throw new RuntimeException("Error en lectura de archivo" +
                    e.getMessage(), e);
        }
    }

}
