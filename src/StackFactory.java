import java.util.*;
public class
StackFactory<T> {

    public IStack<T> getInstance(String type) {

        IStack<T> stack;

        switch (type.toLowerCase()) {
            case "Vector" -> {
                stack = new StackUsingVector<T>();

            }
            case "ArrayList" -> {
                stack = new StackUsingArrayList<T>();

            }
            case "List" -> {
                stack = new StackUsingLinkedList<T>();
                stack = new StackUsingDoubleLinkedList<T>();
                ListFactory<T> stackk = new ListFactory<T>();
            }

            default -> {
                stack = null;
            }
        }
        return stack;
    }
}