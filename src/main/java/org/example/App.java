package org.example;

import java.util.List;

import org.example.model.Ciudad;
import org.example.model.Persona;
import org.example.service.CiudadService;
import org.example.service.PersonaService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PersonaService personaService = new PersonaService("personas.csv");
        CiudadService ciudadService = new CiudadService("ciudades.csv");

        List<Persona> personas = personaService.obtenerTodasLasPersonas();
        personas.forEach(persona -> 
            System.out.println("ID: " + persona.getIdPersona() + ", Nombre: " + persona.getNombre())
        );

        List<Ciudad> ciudades = ciudadService.obtenerTodasLasCiudades();
        ciudades.forEach(ciudad -> 
            System.out.println("ID: " + ciudad.getIdCiudad() + ", Nombre: " + ciudad.getNombre())
        );
    }
}
