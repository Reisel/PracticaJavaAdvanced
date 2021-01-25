package clase05;

import java.util.ArrayList;
import java.util.List;

public class PersonaRepository {
    private List<Persona> list=new ArrayList();

    public PersonaRepository() {
    }
    
    public void add(Persona persona){
        list.add(persona);
    }
    
    public void remove(Persona persona){
        list.remove(persona);
    }
    
    public List<Persona>getAll(){
        return list;
    }
}
