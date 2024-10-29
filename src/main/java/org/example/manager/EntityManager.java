package org.example.manager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.example.model.Ciudad;
import org.example.model.Persona;

public class EntityManager<T> {

    private String csvFilePath;

    public EntityManager(String csvFilePath) {
        this.csvFilePath = csvFilePath;
    }

    @SuppressWarnings("unchecked")
    public List<T> getAll(Class<T> clazz) {
        List<T> resultList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                T instance = null;
                try{
                    Integer.parseInt(values[0]);
                }catch (Exception exc){
                    continue;
                }
                if (clazz == Persona.class) {
                    instance = (T) new Persona(Integer.parseInt(values[0]), values[1]);
                } else if (clazz == Ciudad.class) {
                    instance = (T) new Ciudad(Integer.parseInt(values[0]), values[1]);
                }
                resultList.add(instance);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultList;
    }
}
