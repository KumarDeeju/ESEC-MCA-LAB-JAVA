public class linklist {
    public static class Node {
        int data;
        Node next;

        Node(int data) { // cunstructor 
            this.data = data;
        }
    }

    public static class LinkList {
        Node head = null;
        Node tell = null;

        void insertData(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tell.next = temp;
            }
            tell = temp;
        }

        void firstInsert(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tell = temp;
            } else {
                head.next = temp;
                temp = head;

            }
        }

        void printData() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;

            }
            System.out.println();
        }

        void insertAt(int val, int idx) {
            Node t = new Node(val);
            Node temp = head;
            for (int i = 0; i <= idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;

            // System.out.print(temp.data+" ");
        }

        void size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            System.out.println(count);
        }

    }

    public static void main(String[] args) {
        LinkList lt = new LinkList();
        lt.insertData(2);
        // lt.printData();
        // lt.insertData(5);
        // lt.printData();
        // lt.firstInsert(1);
        // lt.printData();
        // lt.firstInsert(5);
        // lt.printData();
        lt.firstInsert(4);
        lt.firstInsert(3);
        lt.firstInsert(6);
        // lt.printData();
        // lt.size();
        lt.insertAt(4, 2);
        lt.printData();

    }
}
