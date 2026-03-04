public class L9MirrorABST {
    static class Node {
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void mirror(Node root){
        if(root == null){
            return;
        }
        mirror(root.left);
        mirror(root.right);

        // swap
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void main(String[] args) {
         Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        preorder(root);
        System.out.println();
        mirror(root);
        preorder(root);
    }
}