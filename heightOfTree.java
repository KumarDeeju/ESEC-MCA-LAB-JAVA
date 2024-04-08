public class heightOfTree{
    static class Node{
        int data;
        Node left;
        Node right;

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
            int rootLeft = height(root.left);
            int rootRight = height(root.right);
            int maxHeight = Math.max(rootLeft, rootRight) + 1;


            return maxHeight;
        }

        public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.right = new Node(6);
            root.right.left = new Node(7);
            root.right.left.left = new Node(8);

            System.out.println(height(root));

            //                 1                 ^
            //                / \                |          
            //               2   3               |
            //             / \   / \             | h == 4
            //            4   5 7   6            |
            //                 /                 |
            //                8                  ^
        }
}