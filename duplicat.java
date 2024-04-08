import java.util.*;

public class duplicat {

    public static class Node {
        int data;
        Node next;

        Node(int data) { // cunstructor
            this.data = data;
            next = null;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tell = null;

        public static int removeElmt(Node head, int val) {
            while (head != null && head == val) {
                head = head.next;
            }
            if (head == null) {
                return head;
            }
            Node temp = head;
            while (temp != null) {
                if (temp.next.data == val) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
            return head;
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(9);
        list.add(6);
        int val = 6;

        removeElmt(list, val);
    }
}
