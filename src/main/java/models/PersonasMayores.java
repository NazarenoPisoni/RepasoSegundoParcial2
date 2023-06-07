package models;

import java.util.ArrayList;
import java.util.List;

public class PersonasMayores <T extends Persona> {

    private List<T> personasMayores;

    public PersonasMayores(){
        personasMayores = new ArrayList<>();
    }

    public void agregarPersonaMayor(T persona){
        personasMayores.add(persona);
    }

    public List<T> getPersonasMayores() {
        return personasMayores;
    }
}
