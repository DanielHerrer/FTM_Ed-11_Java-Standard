public class Empleado extends Persona {
    String idPersonal;
    float sueldo;

    public Empleado() {
        idPersonal = "";
        sueldo = 0;
    }

    public Empleado(Empleado emp) {
        super(emp.nombre, emp.edad, emp.sexo, emp.dni, emp.bCasado);
        this.idPersonal = emp.idPersonal;
        this.sueldo = emp.sueldo;
    }   	

    public Empleado(Persona persona, String idPersonal, float sueldo) {
        super(persona.nombre, persona.edad, persona.sexo, persona.dni, persona.bCasado);
        this.idPersonal = idPersonal;
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, byte edad, char sexo, String dni, Boolean bCasado, String idPersonal, float sueldo) {
        super(nombre, edad, sexo, dni, bCasado);
        this.idPersonal = idPersonal;
        this.sueldo = sueldo;
    }

    @Override
    public void pintar(){
        System.out.println("ID Personal: "+idPersonal+
                            "\nSueldo: "+sueldo);
    }
    
    @Override
    public String toString() {
        return "Empleado: [idPersonal=" + idPersonal
            + ", sueldo=" + sueldo + ", " +
            super.toString() + "]";
    }

}
