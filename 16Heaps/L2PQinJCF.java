import java.util.Comparator;
import java.util.PriorityQueue;
public class L2PQinJCF {
    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // Max Heap
        pq.add(5); //O(log n)
        pq.add(2);
        pq.add(8);
        pq.add(1);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());  //O(1)
            pq.remove(); // O(log n)
        }
    }
}