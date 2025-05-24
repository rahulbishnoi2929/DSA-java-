package ArrayList;

import java.util.ArrayList;

public class Operations {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
//Find Maximum in an ArrayList
ArrayList<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(5);
    list.add(9);
    list.add(6);
    list.add(8);
    list.add(3);

//Find Maximum in ArrayList    
    //time = O(n)
    // int max = Integer.MIN_VALUE;
    // for(int i=0;i<list.size();i++){
    //     // if(max < list.get(i)){
    //     //     max = list.get(i);
    //     // }
    //     max = Math.max(max, list.get(i));
    // }
    // System.out.println("max element =" + max);



//Swap 2 Numbers
    int idx1 = 1, idx2 = 3;
    System.out.println(list);
    swap(list, idx1, idx2);
    System.out.println(list);
 }
}
