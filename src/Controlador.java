import java.util.*;

public class Controlador {

    Scanner scan = new Scanner(System.in);

    String eleccion;

    public void principal(){
        System.out.println("Escribir la eleccion que desea realizar: Vector, Arraylist, Lists");
        eleccion = scan.next();
        eleccion.toLowerCase();
    }
}
