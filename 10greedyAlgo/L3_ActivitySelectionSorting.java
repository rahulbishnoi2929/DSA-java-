import java.util.*;

public class L3_ActivitySelectionSorting {
    public static void main(String[] args) {
        int start [] = {0,1,3,5,5,8};
        int end [] ={6,2,4,7,9,9};

        //sorting 
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
       int activities [][] = new int[start.length][3];

        for(int i=0;i<start.length;i++){
            activities [i][0] = i;
            activities [i][1] = start[i];
            activities [i][2] = end[i];
        }

        //lambda function -> which is the short form of big function 
        Arrays.sort(activities, Comparator.comparingDouble(o->o[2]));
         //1st ACtivity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for(int i=1; i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                maxAct++;
                ans.add(activities[i][0]); //here we are using 0 because we add the index of array
                lastEnd = activities[i][2];
            }
        }
        System.out.println("max Activites =" + maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
