public class L3BuildBST{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

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

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    
    public static void main(String[] args) {
        int values[] = {7,4,3,5,8,9,6,2,10,1};
       Node root = null;

       for(int i=0; i<values.length; i++){
        root = insert(root,values[i]);
       }

       inOrder(root);
       System.out.println();
    }
}