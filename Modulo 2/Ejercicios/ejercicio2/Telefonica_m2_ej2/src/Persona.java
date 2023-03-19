
public class Persona {
    private String nombre = "";
    private byte edad;
    private char sexo;
    private String dni;
    private Boolean bCasado;


    public Persona(String nombre, byte edad, char sexo, String dni, Boolean bCasado){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = dni;
        this.bCasado = bCasado;
    }

    public void pintar(){
        System.out.println("Nombre: "+nombre+
                            "\nEdad: "+edad+
                            "\nSexo: "+sexo+
                            "\nDNI: "+dni+
                            "\nCasado: "+bCasado);
    }

    public Boolean equals(Persona objeto){
        if(this == objeto)
            return true;
        if(objeto == null)
            return false;
        if(getClass() != objeto.getClass())
            return false;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public byte getEdad() {
        return edad;
    }


    public void setEdad(byte edad) {
        this.edad = edad;
    }


    public char getSexo() {
        return sexo;
    }


    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    public String getDni() {
        return dni;
    }


    public void setDni(String dni) {
        this.dni = dni;
    }


    public Boolean getbCasado() {
        return bCasado;
    }


    public void setbCasado(Boolean bCasado) {
        this.bCasado = bCasado;
    }

}
