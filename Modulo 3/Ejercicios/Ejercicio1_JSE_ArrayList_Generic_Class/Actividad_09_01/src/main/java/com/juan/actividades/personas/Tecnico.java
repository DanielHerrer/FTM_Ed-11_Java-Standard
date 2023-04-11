package com.juan.actividades.personas;

/**
 *
 * @author Hazzer
 */
public class Tecnico extends Empleado{
    
    private String especialidad;
    
    public Tecnico(){
        super();
        especialidad = "";
    }

    public Tecnico(String nombre, int edad, String cuil, String especialidad) {
        super(nombre, edad, cuil);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Tecnico{" + "Especialidad = " + especialidad + '}';
    }
    
}
