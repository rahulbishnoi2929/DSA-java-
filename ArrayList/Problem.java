package ArrayList;
import java.util.*;

public class Problem {
//Problem 1 --> The Most water container 
  // Time Complexiety --> O(n^2)
    // public static int storeWater(ArrayList<Integer> height) {
    //     int maxWater = 0;
    //     //brute force 
    //     for (int i=0; i<height.size();i++){
    //         for(int j = i+1; j<height.size(); j++){
    //             int ht = Math.min(height.get(i), height.get(j));
    //             int width = j-i;
    //             int currWater = ht*width;
    //             maxWater = Math.max(maxWater, currWater);
    //         }
    //     }
    //     return maxWater;
    // }

    // OR the more efficient method 
     // 2 Pointer approach 
     // Time Complexiety --> O(n)

    //  public static int storeWater (ArrayList<Integer> height ){
    //    int maxWater = 0;
    //    int lp = 0;
    //    int rp = height.size()-1;
    //    while(lp < rp){
    //     int ht = Math.min(height.get(lp), height.get(rp));
    //     int width = rp - lp;
    //     int currWater = ht * width;
    //     maxWater = Math.max(maxWater, currWater);
    //     if(height.get(lp) < height.get(rp)){
    //         lp++;
    //     } else {
    //         rp--;
    //     }
    //    }
    //    return maxWater;
    //  }
        
//Pair Sum 1
 // T.C - O(n^2)
    //  public static boolean pairSum1( ArrayList <Integer> list, int target){
    //     for( int i = 0; i< list.size();i++){
    //         for(int j = 0; j<list.size();j++){
    //             if( list.get(i) + list.get(j) == target ){
    //                 return true ;
    //             }
    //         }
    //     }
    //     return false;
    //  }
 
    //OR 
   // 2 Pointer  Approach

   public static boolean pairSum1(ArrayList <Integer> list , int target){
    int lp = 0;
    int rp = list.size();

    while(lp != rp ){
        //case 1
        if( list.get(lp) + list.get(rp) == target){
            return true;
        }
        //case 2
        if(list.get(lp) + list.get(rp) < target){
            lp++;
        }else{
            //case 3
            rp--;
        }
    }
    return false;
   }

    public static void main(String[] args) {
//Problem 1 
        // ArrayList <Integer> height = new ArrayList<>();
        // // 1,8,6,2,5,4,8,3,7
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);
      

        //   System.out.println(storeWater(height));

//Problem 2
     ArrayList <Integer> list = new ArrayList<>();
      // 1,2,3,4,5
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
        int target = 6;
        System.out.println(pairSum1(list, target));
    }
}
