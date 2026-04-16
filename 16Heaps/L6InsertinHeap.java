import java.util.*;
public class L6InsertinHeap {
    static class Heap{
       ArrayList<Integer> arr = new ArrayList<>();

       public void add(int data){
        // add at last index
        arr.add(data);
        
        int x = arr.size() - 1; // child index
        int par = (arr.size() - 2) / 2; // parent index 
        while(arr.get(x) < arr.get(par)){ // min heap  o(logn  )
            // swap
            int temp = arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par, temp);

       }
    }

    public int peek(){
        return arr.get(0);
    }
    }

    public static void main(String[] args) {
        
    }
}