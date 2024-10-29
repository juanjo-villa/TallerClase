package org.example.service;

import java.util.List;

import org.example.model.Ciudad;
import org.example.repository.CiudadRepository;

public class CiudadService {
    
private CiudadRepository ciudadRepository;

    public CiudadService(String filePath) {
        this.ciudadRepository = new CiudadRepository(filePath);
    }

    public List<Ciudad> obtenerTodasLasCiudades() {
        return ciudadRepository.getAllCiudades();
    }

}
