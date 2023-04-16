import entities.*;
import java.util.List;

public class MainFunctions {
    public static void main(String... args) {
        List<Persona> mundo = Persona.crearMundo();
        OperacionesImplementadas operaciones = new OperacionesImplementadas();
        operaciones.mostrarPersonas(mundo);
        System.out.println("Masculinos");
        System.out.println(operaciones.filtroPersonas(mundo, operaciones.esMasculino()));
        System.out.println("Femeninos");
        operaciones.mostrarFiltroPersonas(mundo, operaciones.esFemenino());
        System.out.println("Masculinos y 25");
        operaciones.mostrarFiltroPersonas(mundo, operaciones.cumpleCondiciones(25, "Masculino"));
    }
}