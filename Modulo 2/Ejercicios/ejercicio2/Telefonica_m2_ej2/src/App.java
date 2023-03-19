import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Persona persona = new Persona("Daniel",(byte)24,'m',"41005216",false);
        Persona persona2 = new Persona("Daniel",(byte)24,'m',"41005216",false);
        Empleado empleado = new Empleado(persona, "316", 60000);

        System.out.println("Persona pintar():");
        persona.pintar();
        System.out.println("///////////////////////////");
        System.out.println("Empleado pintar():");
        empleado.pintar();
        System.out.println("///////////////////////////");
        System.out.println("Persona toString():");
        System.out.println(persona);
        System.out.println("///////////////////////////");
        System.out.println("Empleado toString():");
        System.out.println(empleado);
        System.out.println("El objeto Persona y Empleado son iguales?: ");
        if(persona.equals(persona2)){
            System.out.println("Si son iguales");
        }else{
            System.out.println("No son iguales.");
        }
        in.close();
    }
}
