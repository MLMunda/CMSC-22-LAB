package stringqueue;

/**
 *
 * @author Hilaga, Munda, Unabia
 */
import java.util.*;

public class StringQueue {
    private static String[] elements = new String[1];
    private static int count;
    
    public StringQueue() {
        //asdads
    }
    
    public int size() {
        return count;
    }
    
    public void enQueue(String item) {
        elements = Arrays.copyOf(elements, elements.length + 1);
        for(int i = 0; i < count; i++) {
            elements[count - i] = elements[count - i - 1];
        }
        elements[0] = item;
        count++;
    }
    
    public String deQueue(int x) {
        String temp = "";
        for(int i = 0; i < x; i++) {
            temp = elements[count - i];
            elements[count - i] = null;
            count--;
        }
        return temp;
    }
    
    public String peek() {
        return elements[0];
    }
    
    public String toString() {
        if (size() == 0) {
            return "EMPTY";
        }
        String str = "";
        for (int i = 0; i < count - 1; i++) {
            str += elements[i] + ", ";
        }
        return str + elements[size() - 1];
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringQueue line = new StringQueue();
        line.enQueue("something");
        line.enQueue("anything");
        line.enQueue("nothing");
        System.out.println(line);
        line.deQueue(2);
        System.out.println(line);
        System.out.println(line.peek());
        line.enQueue("tae");
        System.out.println(line);
    }
    
}
