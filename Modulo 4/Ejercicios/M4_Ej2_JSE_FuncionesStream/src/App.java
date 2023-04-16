import entities.Persona;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
    
        List<Persona> mundo = Persona.crearMundo();
        for(Persona p: mundo){
            System.out.println(p.toString());
        }

    }
}
