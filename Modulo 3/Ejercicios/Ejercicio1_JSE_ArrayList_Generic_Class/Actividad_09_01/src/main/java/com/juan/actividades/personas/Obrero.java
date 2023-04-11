package com.juan.actividades.personas;

/**
 *
 * @author Hazzer
 */
public class Obrero extends Empleado{
    
    private String cargo;
    
    public Obrero(){
        super();
        cargo = "";
    }

    public Obrero(String nombre, int edad, String cuil, String cargo) {
        super(nombre, edad, cuil);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Obrero{" + "Cargo = " + cargo + '}';
    }
   
}
