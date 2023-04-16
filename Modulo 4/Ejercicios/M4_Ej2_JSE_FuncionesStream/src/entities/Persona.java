package entities;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Persona {

    public static class Mundo {

        private String nombre;
        private int edad;
        private String sexo;

        public Persona nacer(){
            return new Persona(this.nombre,this.edad,this.sexo);
        }

        public Mundo ponNombre(String nombre){
            this.nombre = nombre;
            return this;
        }

        public Mundo ponEdad(int edad){
            this.edad = edad;
            return this;
        }

        public Mundo ponSexo(){
            this.sexo = (Math.random() < 0.5) ? "Masculino":"Femenino";
            return this;
        }

    }

    private String nombre;
    private int edad;
    private String sexo;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public static List<Persona> crearMundo() {
        List<Persona> personas = new ArrayList<>();
        Random r = new Random();
        int num = r.nextInt(6) + 5;  // Numero aleatorio entre 5 y 10
        for (int i = 1; i <= num; i++) {
            int edad = r.nextInt(48) + 18;  // Numero aleatorio entre 18 y 65
            personas.add(new Persona.Mundo().ponNombre("Persona " + i).ponEdad(edad).ponSexo().nacer());
        }
        return personas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
    }

}