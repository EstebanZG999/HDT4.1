import java.util.*;

public class Controlador {

    Scanner scan = new Scanner(System.in);
    int Resultados = 0;
    String eleccion;
    IStack<String> stack;
    IList<String> list;
    String[] array;
    String datos = "";
    String num;
    StackHandmade<String> stackk = new StackHandmade<String>();
    ArrayList<Integer> Operaciones= new ArrayList<Integer>();
    ArrayList<String> ArrayCopia= new ArrayList<String>();
    ArrayList<String> temp = new ArrayList<String>();


    public void principal2(){
        principal();
        Calculadora();
    }
    //Obtenido de Hoja de trabajo 2 grupo 2

    public void Calculadora(){
        Calculator calc;
        calc = Calculator.getInstance();

        ArrayCopia = temp;

        for(int i = ArrayCopia.size()-1; i >= 0 ;i--){
            stackk.push(ArrayCopia.get(i));
        }
        try {
            for(int i = 0; i<= stackk.count;i++){
                Operaciones.add(Integer.valueOf(stackk.pull()));
            }
        }
        catch (Exception ignored){
        }

        int a = Operaciones.get(Operaciones.size()-1);
        int b = Operaciones.get(Operaciones.size()-2);
        Operaciones.remove(Operaciones.size()-1);
        Operaciones.remove(Operaciones.size()-1);
        Mates(a,b,calc);

        for(int i = Operaciones.size()-1; i >= 0; i--){
            Mates(Resultados,Operaciones.get(i),calc);
        }
        System.out.println("El resultado es: " + Resultados);

    }

    public void principal(){
        System.out.println("Escribir la eleccion que desea realizar: Vector, Arraylist, Lists");
        eleccion = scan.next();
        eleccion = eleccion.toLowerCase();
        num = eleccion;
        if(eleccion.equals("vector")){
             stack = (new StackFactory<String>().getInstance(eleccion));
        }
        if(eleccion.equals("arraylist")){
            stack = (new StackFactory<String>().getInstance(eleccion));
        }
        if(eleccion.equals("lists")){
            list = (new ListFactory<String>().getInstance(eleccion));
        }

        Reader read = new Reader();
        datos = Reader.read();
        array = datos.split("");

        if(num.equals("vector")){
            operacionStack();
        }
        if(num.equals("arraylist")){
            operacionStack();
        }
        if(num.equals("lists")){
            operacionLista();
        }
    }

    public void operacionStack(){
        for (int i = 0; i <= array.length-1 ; i++) {
            //Obtenido Hoja de trabajo 2 Grupo 2
            if((array[i].equals("1")) || (array[i].equals("2")) ||(array[i].equals("3")) ||(array[i].equals("4")) ||(array[i].equals("5")) ||(array[i].equals("6")) || (array[i].equals("7")) ||(array[i].equals("8")) ||(array[i].equals("9") ||(array[i].equals("0"))))
            {
                temp.add(array[i]);
            }else if(array[i].equals("*")){
                stack.push(array[i]);
            }else if(array[i].equals("/")){
                stack.push(array[i]);
            }else if(array[i].equals("+")){
                stack.push(array[i]);
            }else if(array[i].equals("-")){
                stack.push(array[i]);
            }else if(array[i].equals("(")){
                stack.push(array[i]);
            }else if(array[i].equals(")")){
                while (!stack.peek().equals("(")){
                    temp.add(stack.pull());
                }
                stack.pull();
            }
        }while(!stack.isEmpty()){
            temp.add(stack.pull());
        }
    }

    public void operacionLista(){
        for (int i = 0; i <= array.length-1 ; i++) {
            //Obtenido Hoja de trabajo 2 Grupo 2
            if((array[i].equals("1")) || (array[i].equals("2")) ||(array[i].equals("3")) ||(array[i].equals("4")) ||(array[i].equals("5")) ||(array[i].equals("6")) || (array[i].equals("7")) ||(array[i].equals("8")) ||(array[i].equals("9") ||(array[i].equals("0"))))
            {
                temp.add(array[i]);
            }else if(array[i].equals("*")){
                list.InsertAtStart(array[i]);
            }else if(array[i].equals("/")){
                list.InsertAtStart(array[i]);
            }else if(array[i].equals("+")){
                list.InsertAtStart(array[i]);
            }else if(array[i].equals("-")){
                list.InsertAtStart(array[i]);
            }else if(array[i].equals("(")){
                list.InsertAtStart(array[i]);
            }else if(array[i].equals(")")){
                while (!list.Get(0).equals("(")){
                    temp.add(list.Get(0));
                }
                list.Get(0);
            }
        }while(!list.IsEmpty()){
            temp.add(list.Get(0));
            list.DeleteAtStart();
        }
    }


//Obtenido de Hoja de trabajo 2 grupo 2
    public void Mates(int a,int b,Calculator calc){
        String Variable = stackk.pull();
        if(Variable.equals("+")){
            Resultados = calc.suma(a,b);

        }
        if(Variable.equals("-")){
            Resultados = calc.resta(a,b);

        }
        if(Variable.equals("*")){
            Resultados = calc.multiplicacion(a,b);

        }
        if(Variable.equals("/")){
            Resultados = calc.division(a,b);
        }
    }

}
