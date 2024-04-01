public class deletElmtLinkList{

    int isSize(int a){
        Node temp = new Node(a);
        int count=0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }


    }
public static void main(String[] args) {
    Node a = new Node(33);
    Node b = new Node(13);
    Node c = new Node(62);
    Node d = new Node(22);
    Node e = new Node(42);

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;

    System.out.println(isSize(a));
}
    
}