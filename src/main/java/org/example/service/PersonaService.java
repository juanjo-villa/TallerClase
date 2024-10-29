package org.example.service;

import java.util.List;

import org.example.model.Persona;
import org.example.repository.PersonaRepository;

public class PersonaService {
    
private PersonaRepository personaRepository;

    public PersonaService(String filePath) {
        this.personaRepository = new PersonaRepository(filePath);
    }

    public List<Persona> obtenerTodasLasPersonas() {
        return personaRepository.getAllPersonas();
    }

}
