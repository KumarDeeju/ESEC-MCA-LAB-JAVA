public class DimeterOfTree {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int Dimeter(Node root){
        if(root == null){
            return 0;
        }
        int leftDimeter = Dimeter(root.left);
        int leftHeight = height(root.left);
        int rightDimeter = Dimeter(root.right);
        int rightHeight = height(root.right);

        int selfDimeter = leftHeight + rightHeight + 1;

        return Math.max(selfDimeter, Math.max(rightHeight, selfDimeter));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(Dimeter(root));
    }
}
