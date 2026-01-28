import java.util.*;
public class L5QueueJCF {
    public static void main(String[] args) {
        Queue <Integer> q = new java.util.LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}
