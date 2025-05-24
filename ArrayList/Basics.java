package ArrayList;

import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//Add Operations - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

       //adds element at given index
        // list.add(1,9); //O(n)
        // System.out.println(list);



// //Get Operations - O(1)
//      int element = list.get(2);
//      System.out.println(element);


// //Remove Element - O(n)

//     list.remove(2);
//     System.out.println(list);

// //Set 
//     list.set(2,10);
//     System.out.println(list);

// //contains-O(n)

//     System.out.println(list.contains(1));
//     System.out.println(list.contains(11));



//Size of ArrayList
    System.out.println(list.size());

    //print the arraylist
//     for(int i=0; i<list.size(); i++){
//         System.out.println(list.get(i) + " ");
//     }
//     System.out.println();


  //Reverse print - O(n)
//   for(int i=list.size()-1; i>=0;i--){
//     System.out.print(list.get(i) + " ");
//   }
//   System.out.println();



   }

}

