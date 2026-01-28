

public class subsets {
    //Find & print all subsets of a given string 
    // "abc"
    // a, b, c, ab, bc, ac, abc, " " (empty set , null set) --> 8subsets 
    //string length n ---> 2^n subsets
     public static void findSubsets(String str, String ans, int i){
        //Base Case 
        if(i == str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }  
        //recursion(kaam)
        //yes choice 
        findSubsets(str, ans+str.charAt(i), i+1);

        //No choice
        findSubsets(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }


}
