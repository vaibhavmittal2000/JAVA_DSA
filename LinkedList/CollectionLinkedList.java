package LinkedList;
import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String[] args) {
        //Create
        LinkedList<Integer> ll = new LinkedList<>();
        //Add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //0->1->2
        System.out.println(ll);
        //Remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}