public class countTreeNode {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int totalCountNode(Node root){
        if(root == null){
            return 0;
        }
        // recursion
        int leftCount = totalCountNode(root.left); // left count
        int rightCount = totalCountNode(root.right); // right count
        return (leftCount + rightCount) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(totalCountNode(root));
    }
}
