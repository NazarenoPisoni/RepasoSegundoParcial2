package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import exceptions.ClaveNoExiste;
import exceptions.EdadMinimaException;
import models.Libro;
import models.Persona;
import models.PersonasMayores;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            Persona[] personas = objectMapper.readValue(new File("generated.json"), Persona[].class);

            for(Persona p : personas){
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Género: " + p.getGenero());
                System.out.println("ID: " + p.getId());
            }

            PersonasMayores<Persona> personasMayores = new PersonasMayores<>();
            try {
                for(Persona p : personas){
                    if(p.getAge() >= 18){
                        personasMayores.agregarPersonaMayor(p);
                    }else {
                        throw new EdadMinimaException("No cumple con la edad mínima requerida, tiene ", p.getAge());
                    }
                }

            }catch (EdadMinimaException e){
                System.out.println("Se encontró una persona menor de edad, tiene " + e.getAge());
            }

            HashSet<String> autoresUnicos = new HashSet<>();
            HashMap<Integer, List<String>> etiquetas = new HashMap<>();
            for(Persona p : personas){
                for(Libro libro : p.getBooks()){
                    autoresUnicos.add(libro.getAuthor());
                }
                List<String> tags = new ArrayList<>(p.getTags());

                etiquetas.put(p.getId(), tags);
            }
            System.out.println(autoresUnicos);
            System.out.println(etiquetas);
            int cantidadPorUsuario = calcularCantidadEtiquetasPorUsuario(etiquetas, 10, "minim");
            System.out.println("Hay " + cantidadPorUsuario + " etiquetas con ese nombre para el usuario ingresado.");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static int calcularCantidadEtiquetasPorUsuario(HashMap<Integer, List<String>> etiquetas, Integer idUsuario,
                                                          String etiqueta) {
        int cantidad = 0;

        try {
            if (etiquetas.containsKey(idUsuario)) {
                List<String> tags = etiquetas.get(idUsuario);
                for (String tag : tags) {
                    if (tag.equals(etiqueta)) {
                        cantidad++;
                    }
                }
            }else throw new ClaveNoExiste("No existe la clave ingresada");
        }catch (ClaveNoExiste e){
            System.out.println("No existe la clave ingresada");
        }
        return cantidad;
    }
}