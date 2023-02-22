
//Obtenido de Hoja de trabajo 2 grupo 2
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void test1(){
        IList list = new SingleLinkedList();
        assertEquals(true,list.IsEmpty());

    }
    @Test
    public void test2(){
        IList list = new DoubleLinkedList();
        assertEquals(true,list.IsEmpty());

    }
    @Test
    public void test3(){
        IStack stack = new StackUsingVector();
        assertEquals(true,stack.isEmpty());
    }

    @Test
    public void test4(){
        IStack stack = new StackUsingArrayList();
        assertEquals(true,stack.isEmpty());
    }

    @Test
    public void test5(){
        IStack stack = new StackUsingDoubleLinkedList();
        assertEquals(true,stack.isEmpty());
    }

    @Test
    public void test6(){
        IStack stack = new StackUsingLinkedList();
        assertEquals(true,stack.isEmpty());
    }
}