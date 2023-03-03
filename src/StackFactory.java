import java.util.*;
public class
StackFactory<T> {

    
    /** 
     * @param type
     * @return IStack<T>
     */
    public IStack<T> getInstance(String type) {

        IStack<T> stack;

        switch (type.toLowerCase()) {
            case "vector" -> {
                stack = new StackUsingVector<T>();

            }
            case "arraylist" -> {
                stack = new StackUsingArrayList<T>();

            }
            default -> {
                stack = null;
            }
        }
        return stack;
    }
}