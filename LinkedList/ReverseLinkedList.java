package LinkedList;

public class ReverseLinkedList {
    public static class Node{
        int data;
        Node next;
        //Constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void print(){ //O(n)
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void reverse(){ //O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        ReverseLinkedList ll = new ReverseLinkedList();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);
        ll.head.next.next.next = new Node(4);
        ll.head.next.next.next.next = new Node(5);
        ll.print(); //1->2->3->4->5->null
        ll.reverse();
        ll.print();
    }
}