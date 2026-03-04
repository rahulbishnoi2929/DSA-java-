public class L6PrintInRange{
      static class Node {
        int data;
        Node left ;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
//Insert the Node
    public static Node insert(Node root, int val){
        if(root == null){
        root = new Node(val);
        return root;
        }

        if(root.data> val ){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
//Inorder
   public static void inOrder(Node root){
    if(root == null){
        return;
    }
    
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);

   }


   //Print in range 
   public static void printInRange(Node root, int k1, int k2){
    if(root == null){
        return;
    }

    if(root.data >= k1 && root.data <= k2){
        printInRange(root.left, k1, k2);
        System.out.print(root.data + " ");
        printInRange(root.right, k1, k2);
   }
    else if(root.data < k1){
        printInRange(root.right, k1, k2);
    }else{
        printInRange(root.left, k1, k2);
    }
   }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;
        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        int k1 = 5, k2 = 12;
        printInRange(root, k1, k2);
    }
}