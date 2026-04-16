import java.util.PriorityQueue;
import java.util.Comparator;
public class L3PQforObjects {
    static class Student implements Comparable<Student>{//overriding compareTo method of Comparable interface
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank; // Max Heap based on marks
        }
    }

    public static void main(String[] args) {
        PriorityQueue <Student> pq = new PriorityQueue<>(); // Max Heap based on marks
        pq.add(new Student("Alice", 4));
        pq.add(new Student("Bob", 5));
        pq.add(new Student("Charlie", 10));
        pq.add(new Student("David", 1));
        pq.add(new Student("Eve", 3));

        while (!pq.isEmpty()) {
            Student topStudent = pq.peek();
            System.out.println(topStudent.name + ": " + topStudent.rank);
            pq.remove(); 
        }
    }
} 