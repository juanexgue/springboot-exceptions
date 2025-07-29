package com.juanex.springboot_exceptions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.juanex.springboot_exceptions.entidades.Persona;
import com.juanex.springboot_exceptions.repositorios.Repo_Persona;

@SpringBootApplication
public class SpringbootExceptionsApplication implements CommandLineRunner {

	@Autowired
	private Repo_Persona repositorio;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootExceptionsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Persona> personas = (List<Persona>) repositorio.findAll();
		personas.stream().forEach(persona -> System.out.println(persona));
	}

}
