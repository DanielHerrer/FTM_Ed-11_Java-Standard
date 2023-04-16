import java.util.List;
import entities.*;
import interfaces.*;

public class OperacionesImplementadas implements OperacionesInterfaz<Persona> {
    
    @Override
    public void mostrarPersonas(List<Persona> personas) {
        personas.forEach(System.out::println);
    }
    
}
