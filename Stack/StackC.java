
import java.util.*;

public class StackC {
//Question 1: Add at the bottom of the stack 
    public static void pushAtBottom(Stack<Integer> stack, int data) {

        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }

        int top = stack.pop();
        pushAtBottom(stack, data);
        stack.push(top);
    }

//Question 2: Reverse a string using a stack
    public static String reverseString(String str){
        Stack<Character> sb = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            sb.push(str.charAt(idx));
            idx++;
        }
        StringBuilder reversed = new StringBuilder();
        while (!sb.isEmpty()) {
            reversed.append(sb.pop());
        }
        return reversed.toString();
    }

//Question 3: Reverse a Stack

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();
        reverseStack(stack);
        pushAtBottom(stack, top);
    }

    //print the stack
    public static void printStack(Stack<Integer> stack) {
       while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    
        
    }


//Question 4: Stock Span Problem 

    public static void stockSpan(int stocks[], int span[]){
        Stack <Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i=1; i<stocks.length; i++){
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }
            s.push(i);

        }
    }

//6 Valid Parentheses 
    public static boolean isValid( String str){
        Stack <Character> sp = new Stack<>();

        for (int i=0; i<str.length();i++){
            char ch = str.charAt(i);

            if( ch == '(' || ch == '{' || ch == '['){ // Opening 
                sp.push(ch);
            }else{
                if(sp.isEmpty()){
                    return false;
                }
                if( (sp.peek() == '(' && ch == ')') //()
                  || (sp.peek() == '{' && ch == '}') //{}
                  || (sp.peek() == '[' && ch == ']')) { //[]
                   sp.pop();
                }else{
                    return false;
                }
            }
        }
     if( sp.isEmpty()){
        return true;
     }else{
        return false;
     }
    }
    public static void main(String[] args) {
//---->1      
        // Stack <Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // pushAtBottom(s, 4);

//---->2
        // String str = "Hello";
        // String reversedStr = reverseString(str);
        // System.out.println("Reversed String: " + reversedStr); // Output: "olleH"
        
      
//---->3
        // Stack<Integer> stack = new Stack<>();
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // System.out.println("Original Stack: " + stack);
        
        // reverseStack(stack);
        // System.out.println("Reversed Stack: " + stack); // Output: [3, 2, 1]    
 //   
 

 //---->4 
    //  int stocks[] = {100, 80, 60, 70, 60, 85, 100};
    //  int span[] = new int[stocks.length];
    //  stockSpan(stocks, span);

    //  for(int i = 0; i<span.length; i++){
    //     System.out.println(span[i]+ " ");
    //  }


//Question 5: Next Greater Element

    // int arr[] = {6,8,0,1,3};

    // Stack <Integer> s = new Stack<>();
    // int nxtGreater[] = new int[arr.length];

    // for(int i = arr.length - 1; i >= 0; i--) {

    //     //1 while
    //     while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
    //         s.pop();
    //     }

    //     //2 if-else
    //     if (s.isEmpty()) {
    //         nxtGreater[i] = -1; // No greater element found
    //     } else {
    //         nxtGreater[i] = arr[s.peek()]; // Next greater element
    //     }

    //     //3 push in the Stack
    //     s.push(arr[i]);
    // }

    // for(int i = 0; i < nxtGreater.length; i++) {
    //     System.out.print(nxtGreater[i] + " ");
    // }
    // System.out.println();



//6 Valid parenthesis
    // String str = "({{[]}})"; // true 
    //  System.out.println(isValid(str));


}
}


