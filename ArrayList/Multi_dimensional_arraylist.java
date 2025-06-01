package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Multi_dimensional_arraylist {
    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>> mainlist = new ArrayList<>();
        //creating 1st list
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        mainlist.add(list1);
        //creating 2nd list
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);   
        list2.add(6);
        mainlist.add(list2);

        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer> currList = mainlist.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        } 

        ArrayList<ArrayList<Integer>> finallist = new ArrayList<>();
        ArrayList<Integer> lst1 = new ArrayList<>();
        ArrayList<Integer> lst2 = new ArrayList<>();
        ArrayList<Integer> lst3 = new ArrayList<>();

        for(int i=1;i<=5;i++){
            lst1.add(i*1);   // 1 2 3 4 5 
            lst2.add(i*2);  // 2 4 6 8 10
            lst3.add(i*3);  // 3 6 9 12 15
        }

        finallist.add(lst1);
        finallist.add(lst2);
        finallist.add(lst3);

        System.out.println(finallist);

        // nested for loop to print the final list
        for(int i=0;i<finallist.size();i++){
            ArrayList<Integer> currList = finallist.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

    }
}
