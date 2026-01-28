
import java.util.Arrays;

public class Sorting {
//Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

//Selection Sort
  public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            int minPos = i;
            for(int j=i+1; j < arr.length; j++){
                if(arr[j] < arr[minPos]){
                    minPos = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp; 
        }   
    }

//Insertion Sort
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr= arr[i];
            int prev = i - 1;
            //finding out the correct position to insert
            while (prev >= 0 && arr[prev] > arr[curr]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //insertion 
            arr[prev + 1] = arr[curr];
    }
}

//Counting Sort
 //--> ONLY used for the small entities or we can say for the small range of numbers 
 
	public static void main(String[] args) {
         int arr[] = {64, 34, 25, 12, 22, 11, 90};
            System.out.println("Unsorted array:");
        printArray(arr);
        
        System.out.println("\nSorted array:");  
        bubbleSort(arr);
        printArray(arr);


    }
}
    

