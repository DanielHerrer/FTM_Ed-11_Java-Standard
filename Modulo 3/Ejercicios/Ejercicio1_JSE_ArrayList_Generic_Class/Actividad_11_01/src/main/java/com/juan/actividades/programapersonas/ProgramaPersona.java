package com.juan.actividades.programapersonas;
// Se añadio a las dependencias del proyecto la ruta de acceso del proyecto Actividad_09_01
import com.juan.actividades.personas.Persona;
import com.juan.actividades.personas.Obrero;
import com.juan.actividades.personas.Tecnico;
import java.util.ArrayList;

public class ProgramaPersona {

    public static void main(String[] args) throws Exception {
        
        System.out.println("Creando array list aleatorio de maximo 20 espacios..");
        int maxList = (int)(Math.random()*19+1);
        ArrayList<Persona> aList = new ArrayList<>(maxList);
        System.out.println("Array List de Personas creada con "+maxList+" espacios");
        
        for(int i=0; i<maxList; i++){
            int op = (int)(Math.random()*5);
            switch(op){
                case 0 -> { 
                    System.out.println("Añadiendo Persona...");
                    Persona p0 = new Persona("Daniel",24);
                    aList.add(i,p0);
                }
                case 1 -> {
                    System.out.println("Añadiendo Tecnico...");
                    Persona p1 = new Tecnico("Juan",27,"2042104850","Tecnico Electricista");
                    aList.add(i,p1);
                }
                case 2 -> {
                    System.out.println("Añadiendo Obrero...");
                    Persona p2 = new Obrero("Matias",20,"204157480","Peon de Obra");
                    aList.add(i,p2);
                }
                case 3 -> {
                    System.out.println("Añadiendo Tecnico...");
                    Persona p3 = new Tecnico("Lucas",34,"192345864","Tecnico Informatico");
                    aList.add(i,p3);
                }
                case 4 -> {
                    System.out.println("Añadiendo Obrero...");
                    Persona p4 = new Obrero("Nahuel",21,"213546987","Soldador");
                    aList.add(i,p4);
                }
            }
        }
        
        for(Persona p: aList){
            System.out.println("---------------------------------------");
            System.out.println(p.toString());
        }
        
    }
}
