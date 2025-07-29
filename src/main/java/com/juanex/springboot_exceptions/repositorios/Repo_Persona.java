package com.juanex.springboot_exceptions.repositorios;

import org.springframework.data.repository.CrudRepository;
import com.juanex.springboot_exceptions.entidades.Persona;

public interface Repo_Persona extends CrudRepository<Persona, Long> {

}
