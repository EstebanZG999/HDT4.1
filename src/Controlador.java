import java.util.*;

public class Controlador {

    Scanner scan = new Scanner(System.in);

    String eleccion;
    IStack<String> stack;
    IList<String> list;

    public void principal(){
        System.out.println("Escribir la eleccion que desea realizar: Vector, Arraylist, Lists");
        eleccion = scan.next();
        eleccion = eleccion.toLowerCase();
        if(eleccion.equals("Vector")){
            IStack<String> stack = (new StackFactory<String>().getInstance(eleccion));
        }
        if(eleccion.equals("Arraylist")){
            IStack<String> stack = (new StackFactory<String>().getInstance(eleccion));
        }
        if(eleccion.equals("Lists")){
            IList<String> list = (new ListFactory<String>().getInstance(eleccion));
        }
    }
}
