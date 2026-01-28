public class L5DeleteNode{
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

//Search
   public static boolean search(Node root, int key){
    if(root == null){
        return false;
    }

    if(root.data == key){
        return true;
    }
    if(root.data > key){
      return search(root.left, key);
    }else {
        return search(root.right, key);
    }
   }

//Delete a Node 
   public static Node delete(Node root, int val){
    if(root.data < val){
        root.right = delete(root.right, val);
    }else if(root.data > val){
        root.left = delete(root.left, val);
    }
    else{ // voila
        // Case 1 - leaf node 
        if(root.left == null && root.right == null){
            return null;
        }

        //Case 2 - Single child
        if(root.left == null){
            return root.right;
        }
        else if(root.right == null){
            return root.left;
        }
       
        //Case 3 - Both Children
        
    }
   }

    public static void main(String[] args) {
        int values[] = {5,3,2,7,6,1};
         
       Node root = null;

    }
}