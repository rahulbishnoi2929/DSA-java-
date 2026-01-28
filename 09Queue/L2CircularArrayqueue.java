public class L2CircularArrayqueue {
    
     static class Queue{
       static int arr[];
       static int size;
       static int front;
       static int rear;

        Queue (int n){ // Fixed constructor name
             arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        public static boolean isEmpty(){
            return front == -1 && rear == -1;
        }

        public  static boolean isFull(){
            return (rear + 1) % size == front;
        }

        //Add
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            // Adding the first element
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        //Remove 
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }


            int result = arr[front];

            
            //last element delete
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front + 1)%size;
            }
             return result;
            }

            //Peek 
            public static int peek(){
                if(isEmpty()){
                    System.out.println("empty queue");
                    return -1;
                }

                return arr[front];
            }
     }
    public static void main(String[] args) {
        
        Queue g = new Queue(3);

        g.add(1);
        g.add(2);
        g.add(3);

        System.out.println(g.remove());
        g.add(4);
        System.out.println(g.remove());
        g.add(5);

        while(!g.isEmpty()){
            System.out.println(g.peek());
            g.remove();
        }
    }
    
}