import java.util.*;

public class L12_PractiseQuestions {

    // Question 1: Maximum Balanced String Partitions
    // WE ahve balanced string str of size N with an equal number of L and R the
    // task is to find a maximum number X,
    // such that a given string can be partitioned into X balanced strings.
    // A string is called balanced if the number of 'L's in the string equals the
    // number of 'R's.
    // Example: str = "RLRRLLRLRL" => output = 4

    static int BalancedPartitions(String str, int n) {
        if (n == 0)
            return 0;

        int r = 0, l = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'R') {
                r++;
            } else if (str.charAt(i) == 'L') {
                l++;
            }

            if (r == l)
                count++;
        }
        return count;
    }

    //Question 2: Kth largest odd number in a given range 
    //We have two variables L and R, indicating a range of integers from L to R inclusive.
    //and a number K, the task is to find the Kth largest odd number. 
    // if K>number of odd numbers in the range L to R then return 0.

    //Sample Input 1: L =-3, R = 3, k=1
    //Sample Output 1: 3



    public static int kthOdd(int[] range , int K){
        if (K<=0) return 0;

        int L = range [0];
        int R = range [1];

        if((R & 1) > 0 ){
            int Count = (int) Math.ceil((R - L + 1)/ 2);
            if (K > Count) return 0;
            else return (R - 2*K + 2);
        } else {
            int Count = (R-L+1)/2;
            if(K>Count) return 0;
            else return (R - 2*K + 1);

        }
    }

//Question 3: Lexicographically smallest string of length N and sum K 
  // We have two integers N and K . The task is to print the lexicographically smallest string of 
  // length N consistiing of lower- case English alphabets such that the sum of the characters of 
  // the string equals to K where 'a' = 1, 'b' = 2, 'c' = 3 ........ and 'z' = 26.

  //Sample Input 1: N =5, K= 42   Sample input2 : N = 3 , K = 25
  //Sample Output 1: aamz         Sample output2: aaw

   public static char [] lexo_small(int n, int k){
    char arr [] = new char[n];
    Arrays.fill(arr,'a');
    for(int i = n-1; i>=0;i--){
        k-=i;
        if(k>=0){
            if(k>=26){
                arr[i] = 'z';
                k-=26;
            }
            else{
                arr[i] = (char)(k + 97 -1);
                k -= arr[i] - 'a' + 1;

            }
        }
        else {
         break;
        }
        k+=i;

    }
    return arr;

   }
    public static void main(String[] args) {
       
    //Question 1: Maximum Balanced String Partitions
        // String str = "RLRRLLRLRL";
        // int n = str.length();
        // System.out.println("max balanced partitions are: " + BalancedPartitions(str, n));



    //Question 2: Kth largest odd number in a given range
    //    int [] p = {-3, 3};
    //      int k = 1;
    //         System.out.println("Kth largest odd number is: " + kthOdd(p, k));
    // 
    
//Question 3: Lexicographically Smallest string of length N and sum K
  int n = 5, k = 42;
  char arr[] = lexo_small(n, k);

  System.out.print(new String(arr));

}
}
