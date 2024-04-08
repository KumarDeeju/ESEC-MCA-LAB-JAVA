import java.util.*;
public class removeDup {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void removeDuplicate(LinkedList<Integer> list, int val){
        if(list == null){
            return;
        }
        while (list != null) {
            if(list.data = val){
                list = list.next;
            }else if(list.next.data = val){
                list = list.next.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = List.of(2, 3, 4, 6, 7, 9, 4);
        int val = 4;
        removeDuplicate(list, val);
    }
}
