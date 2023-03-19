
public class Persona {
    String nombre = "";
    byte edad;
    char sexo;
    String dni;
    Boolean bCasado;


    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.sexo = 'X';
        this.dni = "";
        this.bCasado = null;
    }

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

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", dni=" + dni + ", bCasado="
                + bCasado + "]";
    }

    @Override
    public boolean equals(Object objeto){   // COMPARA SI DOS OBJETOS SON IGUALES
        boolean igual = false;  // Inicializo el boolean en false para que no de error.
        if(this == objeto){     
            igual = true;
        }
        if(objeto == null){
            igual = false;
        }
        if(getClass() != objeto.getClass()){
            igual = false;
        }
        Persona otro = (Persona) objeto;
        if(nombre == null){
            if(otro.nombre != null){
                igual = false;
            }
        }else if(!nombre.equals(otro.nombre)){
            igual = false;
        }
        if(edad != otro.edad){
            igual = false;
        }
        if(sexo != otro.sexo){
            igual = false;
        }
        if(dni != otro.dni){
            igual = false;
        }
        if(bCasado != otro.bCasado){
            igual = false;
        }
        return igual;
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
