public class L4SearchBST {
   static class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
    }
   }
   //Insert 
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        
        if(root.data > val){
           root.left =  insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }

   //InOrder 
    public static void inOrder(Node root){
        if (root ==null) {
         return;            
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    //Search in BST
    // Time complexity = O(H) - height of tree

   public static boolean search(Node root, int key){
    if(root == null){
        return false;
    }
    if(root.data == key){
        return true;
    }

    if(root.data > key){
       return search(root.left, key);
    }else{
        return search(root.right, key);
    }
   }
    public static void main(String[] args) {
         int values[] = {7,4,3,5,8,9,6,2,10,1};
       Node root = null;

       for(int i=0; i<values.length; i++){
        root = insert(root,values[i]);
       }
       inOrder(root);
       System.out.println();

       if(search(root, 11)){
        System.out.println("Found the key ");
       }else{
        System.out.println("Not Found ");
       }
    }
}