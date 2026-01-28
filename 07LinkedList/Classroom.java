
import java.util.LinkedList;

public class Classroom {

    
    public static void main(String[] args) {
        // Create a LinkedList instance
        //you can use only objects of type Integer,Float,Double,Character,String
        LinkedList<Integer> ll = new LinkedList<>();

        // Add elements to the LinkedList
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //0 -> 1 -> 2
        System.out.println(ll); // Print the LinkedList 

        //Remove an element from the LinkedList
        ll.removeFirst(); // Removes the first element (0)
        //1 -> 2
        ll.removeLast(); // Removes the last element (2)
        //1 

    }
}
