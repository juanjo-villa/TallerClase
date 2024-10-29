package org.example.repository;

import java.util.List;

import org.example.manager.EntityManager;
import org.example.model.Persona;

public class PersonaRepository {
    
    private EntityManager<Persona> entityManager;

    public PersonaRepository(String filePath) {
        this.entityManager = new EntityManager<>(filePath);
    }

    public List<Persona> getAllPersonas() {
        return entityManager.getAll(Persona.class);
    }
    
}
