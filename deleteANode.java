public class deleteANode {
    static class Node{
        int data;
        Node left,right;

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
    public static Node delete(Node root, int key){
        if(root == null){
            return null;
        }
        if(root.data < key){
            root.right = delete(root.right, key);
        }else if(root.data > key){
            root.left = delete(root.left, key);
        }else{ // case 1 leaf Node
            if(root.left == null && root.right == null){
                return null;
            }else{ //case 2 single child
                if(root.left == null){
                    return root.right;
                }else if(root.right == null){
                    return root.left;
                }
                // both children
                Node IS = findInorderSuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
            }
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
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
        int[] value = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        int key = 10;
        Node root = null;
        for(int i=0;i<value.length;i++){
            root = insert(root, value[i]);  
        }
        inOrder(root);
        System.out.println();
        delete(root, key);

        inOrder(root);
    }
}
