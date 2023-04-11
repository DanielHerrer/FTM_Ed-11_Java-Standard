package com.juan.actividades.personas;

/**
 *
 * @author Hazzer
 */
public class Empleado extends Persona {
    
    private String cuil;
    
    public Empleado(){
        super();
        cuil = "";
    }

    public Empleado(String nombre, int edad, String cuil) {
        super(nombre, edad);
        this.cuil = cuil;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Empleado{" + " CUIL = " + cuil + '}';
    }
    
}
