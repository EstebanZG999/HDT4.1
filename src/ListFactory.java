import java.util.*;

public class ListFactory <T>{

    public IList<T> getInstance(String type){

        IList<T> list;

        switch (type.toLowerCase()) {
            case "single" -> {
                list = new SingleLinkedList<T>();
            }
            case "double" -> {
                list = new DoubleLinkedList<T>();
            }
            default -> {
                list = null;
            }
        }

            return list;

        }




}
