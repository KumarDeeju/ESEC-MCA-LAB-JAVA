public class printRangNode {
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
        if(root.data < val){
            root.right = insert(root.right, val);
        }else{
            root.left = insert(root.left, val);
        }
        return root;
    }
    public static void rangePrint(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            rangePrint(root.left, k1, k2);
            System.out.print(root.data+" ");
            rangePrint(root.right, k1, k2);
        }else{
            if(root.data < k1){
                rangePrint(root.left, k1, k2);
            }else{
                rangePrint(root.right, k1, k2);
            }
        }
    }
    public static void InOrder(Node root){
        if(root == null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }
    public static void main(String[] args) {
        int[] value = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for(int i=0;i<value.length;i++){
            root = insert(root, value[i]);
        }
        InOrder(root);
        System.out.println();
        rangePrint(root, 5, 12);
    }
}
