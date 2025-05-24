public class RecursionBasics {
   public static void printDec(int n){
    if(n == 1){
        System.out.println(n);
        return;
    }
    System.out.print(n+" ");
    printDec(n-1);
   }
   public static void printInc(int n){
    if(n == 10){
        System.out.println(n);
        return;
    }
    System.out.print(n+" ");
    printInc(n+1);
   }

// problem 3 Print factorial of a number n

   public static int fact(int n){
    if ( n==0){
    return 1;
    }
      int fnm1 = fact(n-1);
      int fn = n * fact(n-1);
      return fn;
   }


// probelm 4 print sum of first n natural numbers

   public static int calcSum(int n){
    if (n == 1){
        return 1;
    }
    int snm1 = calcSum(n-1);
    int Sn = n + snm1;
    return Sn;

   }


// fibonacci number  fib(n) = fib(n-1) + fib(n-2);

   public static int fib( int n){
    if (n==0 || n==1){
        return n;
    }

    int  fnm1 = fib(n-1);
    int fnm2 = fib(n-2);
    int fn = fnm1 + fnm2;

    return  fn;
   }

// problem 6 check if a given array is sorted or not 

   public static boolean isSorted(int arr [], int i){
    if (i == arr.length-1){
        return true;
    }
    
    if (arr[i] > arr[i+1]){
        return false;
    }

    return isSorted(arr, i+1);
   }

// problem 7 --> write a function to find the first occurence of an element in an array
   public static int firstOccurence(int arr[], int key, int i ){
    if (i == arr.length){
        return -1;
    }
    
    if (arr[i] == key){
        return i;
    }
    return firstOccurence(arr, key, i+1);
   }


// problem 8 -->  Write a function the last Occurence of an element in an array
   public static int lastOccurence(int arr[], int key, int i ){
     // base case
    if ( i == arr.length){
        return -1;
    }
   // this will help to find if the key is present after founding one key
    int isFound = lastOccurence(arr, key, i+1);

    if(isFound == -1 && arr[i] == key){
        return i;
    }
    return isFound;
    };

//problem 9 --> Print x^n 
   public static int power(int x, int n){
    if (n == 0){
        return 1;
    }
    // int xpnm1 = power(x, n-1);
    // int xn = x * xpnm1;
    // return xn;
    
    return x * power(x, n-1);
   };

   public static int optimizedPower (int x, int n){
    
    if ( n ==0){
        return 1;
    }
    //but this statement will take O(n) time complexity because it will calculate the power of x for n times
    // int halfPowerSq = optimizedPower(x, n/2) * optimizedPower(x, n/2);

    // so we can optimize it by calculating the power of x for n/2 and then multiply it with itself
    int halfPower = optimizedPower(x, n/2);
    int halfPowerSq = halfPower * halfPower;

    // if n is odd 
    if (n % 2  != 0){
        halfPowerSq = halfPowerSq * x;
    }

    return halfPowerSq;
   }

   


//problem 12  tilling problem 
    // Given a "2*n" board and tiles of sice "2*1", count the number of ways to fill the board using the tiles.
    // The tiles can be placed either horizontally or vertically.

    public static int tilingProblem(int n){ // 2*n (floor size)
     // base case  
        if (n == 0 || n == 1){   
           return 1;
        }
        // kaam 
      //vertical choice
        int fnm1 = tilingProblem(n-1); // 2*(n-1) (floor size)
      // horizontal choice
        int fnm2 = tilingProblem(n-2); // 2*(n-2) (floor size)

        int totalways = fnm1 + fnm2;
        return totalways;
    }
//problem 13 --> remove duplicates from a string
    // "appnnacollege" --> "apncolg"
    public static void removeDuplicates(String str ,int idx , StringBuilder newStr, boolean map []){
        if (idx == str.length()){
            System.out.println(newStr);
            return;
        }

        //kaam 
        char currChar = str.charAt(idx);
        // check if the character is already present in the map
        if (map[currChar - 'a'] == true){
            // do not add the character
            removeDuplicates(str, idx+1, newStr, map);
        }else{
            // add the character to the map and new string
            map[currChar - 'a'] = true;
           
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

// problem 14 --> pairing problem 

    public static int friendsPairing(int n ){
        // base case
        if (n == 1 || n == 2){
            return n;
        }

        //choice 
        // 1. single
        int fnm1 = friendsPairing(n-1); 

        // 2. pair
        int fnm2 = friendsPairing(n-2); // n-2 because 2 are already paired
        int pairWays = (n-1) * fnm2; // n-1 because we have to choose one friend from n-1 friends

        // total ways
        return fnm1 + pairWays;

        // simple way in only one line 
        // return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }

    public static void main(String[] args) {
        // int n= 5;
        // System.out.println(calcSum(n));

        // int arr[] = {1,2,3,4};  
        // System.out.println(isSorted(arr, 0));  

        // int arr[] = {8,3,2,4,5,6,2,3,10,2,4,5,2};
        // // System.out.println(firstOccurence(arr,5, 0));
        // System.out.println(lastOccurence(arr, 5, 0));

        // System.out.println(power(2, 10));

      //  System.out.println(optimizedPower(2, 7));

       // System.out.println("the number of ways = " + tilingProblem(4)); // 2*n (floor size)

    //12
        // String str = "appnnacollege";
    
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

    //14
    System.out.println(friendsPairing(04));

    }
}