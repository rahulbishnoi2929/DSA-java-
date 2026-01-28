import java.util.*;

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
    public void add(int idx, int data) {
        if (idx == 0) {
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

    // Remove First
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

// Remove Last
     public int removeLast(){
        if ( size == 0 ){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        } 
        // prev node : i = size - 2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; // value to be returned(tail.data)
        prev.next = null; // unlinking the last node
        tail = prev; // updating tail to the previous node
        size--;
        return val; // returning the value of the last node
     }
  



    // Iterative Search
    // Search for a key in a linkedlist Return the position where it is found If not
    // found -1.
    // time complexity = O(n) --> beacause we are traversing the linked list in our worst case

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i; // return the index where the key is found
            }
            temp = temp.next;
            i++;
        }
        // key not found
        
        return -1;

    }
// Recursive Search
public int helper(Node head, int key) {
    // base case 
    if(head == null) {
        return -1; // key not found
    }
    if(head.data == key) {
        return 0; // key found at current position
    }
    int idx = helper(head.next, key); // recursive call to the next node
    if(idx == -1) {
        return -1; // key not found in the rest of the list
    }   
    return idx + 1; // key found in the rest of the list, return index incremented by 1
}

public int recSearch(int key) {
    return helper(head, key); // start the recursive search from the head   
}


// Reverse the linked list
    public void reverse() {
        if (head == null || head.next == null) {
            return; // empty or single node list, no need to reverse
        }
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next; // store the next node
            curr.next = prev; // reverse the link
            prev = curr; // move prev to current
            curr = next; // move to the next node
        }
        head = prev; // update head to the new first node
    }

//Delete from Nth position
    


//Remove the cycle 
    public static void removeCycle(){
        // detect cycle 
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next; // move slow by 1
            fast = fast.next.next; // move fast by 2
            if (slow == fast) { // cycle detected
                cycle = true;
                break;
            }
        }
        if (cycle == false){
            return; // no cycle found
        }
        
        //find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast){
            prev = fast; // keep track of the previous node
            slow = slow.next; // move slow by 1
            fast = fast.next; // move fast by 1
        }

        //remove cycle -> last.next = null
        prev.next = null; // unlink the last node to remove the cycle
    }

//Merge Sort in the LInked List

    private Node getMid(Node head) {
        if (head == null || head.next == null) {
            return head; // base case, single node or empty list
        }
        Node slow = head;
        Node fast = head.next; // start fast one step ahead

        while (fast != null && fast.next != null) {
            slow = slow.next; // move slow by 1
            fast = fast.next.next; // move fast by 2
        }
        return slow; // slow is now at the middle of the list
    }

    private Node merge(Node head1 , Node head2){
        Node mergedLL = new Node(-1); // dummy node to start the merged list
        Node temp = mergedLL; // pointer to build the new list
          while(head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1; // link the smaller node
                head1 = head1.next; // move to the next node in list 1
            } else {
                temp.next = head2; // link the smaller node
                head2 = head2.next; // move to the next node in list 2
            }
            temp = temp.next; // move temp to the last node in merged list
    }
    while (head1 != null){
        temp.next = head1; // link remaining nodes from list 1
        head1 = head1.next; // move to the next node in list 1
        temp = temp.next; // move temp to the last node in merged list
    }
    while (head2 != null){
        temp.next = head2; // link remaining nodes from list 2
        head2 = head2.next; // move to the next node in list 2
        temp = temp.next; // move temp to the last node in merged list
    }

    return mergedLL.next; // return the next of dummy node, which is the head of the merged list
}

    public Node mergeSort(Node head) {
        // base case
        if (head == null || head.next == null) {
            return head; // single node or empty list, no need to sort
        }

        // find the middle of the linked list
        Node mid = getMid(head);

        //Right and left halves
       Node rightHead = mid.next; // right half starts from mid.next
       mid.next = null; // split the list into two halves
        Node newLeft = mergeSort(head); // sort the left half
        Node newRight = mergeSort(rightHead); // sort the right half

        return merge(newLeft, newRight); // merge the sorted halves
    }


// Zig Zag Linked list 
public void zigZag() {
// find Mid 
    Node slow = head;
    Node fast = head.next;

    while (fast != null && fast.next != null) {
        slow = slow.next; // move slow by 1
        fast = fast.next.next; // move fast by 2
    }
    Node mid = slow; // mid is now at the middle of the list

    // Reverse the Second half 
    Node curr = mid.next; // start from the node after mid
    mid.next = null; // split the list into two halves
    Node prev = null;  
    Node next;

    while( curr != null) {
        next = curr.next; // store the next node
        curr.next = prev; // reverse the link
        prev = curr; // move prev to current
        curr = next; // move to the next node
    }

    Node left = head;
    Node right = prev; // right is now the head of the reversed second half
    Node nextL , nextR;

    // alt merge - zig zag merge 
    while (left != null && right != null) {
        nextL = left.next; // store the next node in left
        left.next = right; // link left to right
        nextR = right.next; // store the next node in right
        right.next = nextL; // link right to the next node in left

        left = nextL; // move left to the next node in left
        right = nextR; // move right to the next node in right
    }

}

    
    

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addLast(3);

        
        // ll.print(); // 5 -> 4 -> 3 -> 2 -> 1 -> null
        // System.out.println(ll.size);

        // System.out.println(ll.itrSearch(3)); // should return 2
        // System.out.println(ll.itrSearch(6)); // should return -1
        
//for detecting cycle and removing it  
        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = new Node(4);
        // head.next.next.next.next = head.next; // creating a cycle (4 -> 2)

    // System.out.println(isCycle()); // should return true
      //  removeCycle(); // removing the cycle
      //  System.out.println(isCycle()); // should return false


        // for merge sort
        ll.addLast(4);
        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(3);
        ll.print(); // 4 -> 2 -> 1 -> 3 -> null
        head = ll.mergeSort(head); // sorting the linked list
        ll.print(); // 1 -> 2 -> 3 -> 4 -> null
    }


}
