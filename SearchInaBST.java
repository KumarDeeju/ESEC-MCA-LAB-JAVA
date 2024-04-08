public class SearchInaBST {
    static class Node{
        int data;
        Node left, right;

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
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
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
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    
    public static void main(String[] args) {

        int value[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for(int i=0;i<value.length;i++){
            root = insert(root, value[i]);
        }

        inOrder(root);
        System.out.println();

        if(search(root, 1)){
            System.out.println("found");
        }else{
            System.out.println("no found");
        }

        // Node root = new Node(8);
        // root.left = new Node(5);
        // root.right = new Node(10);
        // root.left.left = new Node(3);
        // root.left.right = new Node(6);
        // root.left.left.left = new Node(1);
        // root.left.left.right = new Node(4);
        // root.right.right = new Node(11);
        // root.right.right.right = new Node(14);

        // int key = 1;
        // System.out.println(searchBst(root, key));
       
    }
}
