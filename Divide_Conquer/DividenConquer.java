 public class DividenConquer{
 // Merge Sort
    // Time Complexity: O(nlogn)
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei){
       if(si >= ei){
           return; //base case
       }
       
        //kaam 
       int mid = si + (ei - si) / 2;
       mergeSort(arr, si, mid); //left part
       mergeSort(arr, mid + 1, ei); //right part

       merge (arr, si, mid , ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        //left(0,3)=4 , right(4,6)=3 -> 6-0+1 = 7
        int temp[] = new int[ei-si+1];
        int i = si; //starting index of left part
        int j = mid + 1; //iterator for right part
        int k = 0; //iterator for temp array

        while (i <= mid && j<= ei ){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++; 
            } else {
                temp[k] = arr[j];
                   j++; 
                   
            }
            k++;
         
        }

        //left part
        while(i <= mid){
            temp[k++] = arr[i++];
           
        }
        //right part

        while(j <= ei){
            temp[k++] = arr[j++];
        }
        //copy temp to original array 
        for(k = 0, i = si; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }



//Quick Sort
    // Time Complexity: O(nlogn)
    //Worst case (n^2) when the array is already sorted
    
    //we take pivot as last element of the array

    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }

        //last element
      int pIdx = partition(arr, si, ei);
      quickSort(arr, si, pIdx-1); // left part
      quickSort(arr, pIdx+1, ei); //right part
    }

    public static int partition( int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; //to make place for els smaller than pivot

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
              i++;
             //swap
               int temp = arr[j];
               arr[j] = arr[i];
               arr[i] = temp; 
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];  //pivot = arr[i]
        arr[i] = temp; 
        return i;
    }


//Question --> search and rotated array

    public static int search(int arr[], int tar, int si, int ei){
         //base case
         if(si>ei){
            return -1;
         }
        //kaam
        int mid = si + (ei-si)/2;

        //case FOUND 
        if(arr[mid] == tar){
            return mid;
        }

        //mid on line L1
        if(arr[si] <= arr[mid]){
            //case a : left
          if(arr[si] <= tar && tar <= arr[mid]){
           return search(arr, tar, si, mid-1);
          } else {
            //case b : right
           return search(arr, tar, mid+1, ei);
          }
        }

        //mid on line L2
        else{
            //case c : right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid+1, ei);
            }else{
            //case d : left
                return search(arr, tar, si, mid-1);
            }
        }

    }
   
//Question 1 : apply Merge sort an array of Strings(Assume that all the characters in all the Strings are in lowercase)
   //Sample Input 1 : arr = {"sun","earth","mars","mercury"}
   //Sample Output 1 : arr = {"earth", "mars", "mercury", "sun"}

   public static String[] mergeSort1(String[] arr, int lo, int hi){
    if(lo == hi){
        String[] A = { arr[lo] };
        return A;
    }
    int mid = lo + (hi - lo)/2;
    String[] arr1 = mergeSort1(arr, lo, mid);
    String [] arr2 = mergeSort1(arr, mid + 1, hi);

    String [] arr3 = merge1(arr1, arr2);
    return arr3;
   }

   static String[] merge1 (String[] arr1, String[] arr2){
    int m = arr1.length;
    int n = arr2.length;

    String[] arr3 = new String[m + n];

    int idx = 0;

    int i = 0;
    int j = 0;


    while(i < m && j < n){
        if(isAlphabeticallySmaller(arr1[i], arr2[j])){
            arr3[idx] = arr1[i];
            i++;
            idx++;
        }
        else {
            arr3[idx] = arr2[j];
            j++;
            idx++;
        }
    }
    while(i < m){
        arr3
    }

   }
    public static void main(String args[ ]) {
       // int arr[] = {6, 3, 9, 5, 2, 8, -2};
       // mergeSort(arr,0,arr.length-1 );
       // printArr(arr);

      // quickSort(arr, 0, arr.length-1);
      // printArr(arr);

    //   int arr[] = {4,5,6,7,0,1,2};
    //   int target = 0; //output -> 4
    //   int tarIdx = search(arr, target, 0, arr.length-1);
    //   System.out.println(tarIdx);
    }
 } 