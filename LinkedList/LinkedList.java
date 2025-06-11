package LinkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Methods

    public void addFirst(int data) {
        // step 1 create a new node
        Node newNode = new Node(data);
        // step 2 if linked list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 3 if linked list is not empty
        newNode.next = head; // linking new node to the current head
        // step 4 updating head to new node
        head = newNode;
    }

    // add last

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print the linked List
    // time complexity = O(n)
    public void print() {
        if (head == null) {
            System.out.println(" LL is empty ");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

// Add in the specific position
    public void add( int idx, int data){
        if ( idx == 0){
            addFirst(data);
            return;
        }
        // step 1 create a new node
        Node newNode = new Node(data);
        
        // step 2 if linked list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i = idx - 1 , temp is at idx - 1 position
        newNode.next = temp.next; // linking new node to the next of temp
        temp.next = newNode; // linking temp to the new node
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(1);

        ll.addFirst(2);

        ll.addFirst(4);

        ll.addFirst(5);

        ll.add(2,3 ); // adding 9 at index 2
        ll.print(); // 5 -> 4 -> 3 -> 2 -> 1 -> null
        System.out.println(ll.size);
    }

}

