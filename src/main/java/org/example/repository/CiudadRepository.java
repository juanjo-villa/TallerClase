package org.example.repository;

import java.util.List;

import org.example.manager.EntityManager;
import org.example.model.Ciudad;

public class CiudadRepository {
 
    private EntityManager<Ciudad> entityManager;

    public CiudadRepository(String filePath) {
        this.entityManager = new EntityManager<>(filePath);
    }

    public List<Ciudad> getAllCiudades() {
        return entityManager.getAll(Ciudad.class);
    }
}
