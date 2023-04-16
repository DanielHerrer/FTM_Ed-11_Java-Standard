package interfaces;
import entities.*;
import java.util.List;
import java.util.function.Predicate;

public interface OperacionesInterfaz<T> {
    
    default Predicate<Persona> cumpleCondiciones(int edad, String sexo) {
        return p -> p.getEdad() >= edad && p.getSexo().equals(sexo);
    }
    
    default Predicate<Persona> esDeGenero(String sexo) {
        return p -> p.getSexo().equals(sexo);
    }
    
    default Predicate<Persona> esFemenino() {
        return p -> p.getSexo().equals("Femenino");
    }
    
    default Predicate<Persona> esMasculino() {
        return p -> p.getSexo().equals("Masculino");
    }
    
    default List<Persona> filtroPersonas(List<Persona> personas, Predicate<Persona> filtro) {
        return personas.stream().filter(filtro).toList();
    }
    
    default void mostrarFiltroPersonas(List<Persona> personas, Predicate<Persona> filtro) {
        filtroPersonas(personas, filtro).forEach(System.out::println);
        //filtroPersonas(personas, filtro).forEach(p -> System.out.println(p + "\n"));
    }
    
    abstract void mostrarPersonas(List<Persona> personas);
    
    default Predicate<Persona> tieneMasDe(int edad) {
        return p -> p.getEdad() > edad;
    }
    
}