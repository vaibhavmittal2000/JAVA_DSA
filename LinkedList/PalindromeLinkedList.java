package LinkedList;

public class PalindromeLinkedList {
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
    //Slow-Fast Approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; //Slow is the mid node
    }
    public boolean checkPalindrome(){
        if(head == null || head.next == null) {
            return true;
        }

        //Step 1: Find Mid
        Node midNode = findMid(head);

        //Step 2: Reverse 2nd half of linked list
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //Right Half Head
        Node left = head; //Left Half Head

        //Step 3: Check Left Half and Right Half
        while (right != null) {
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromeLinkedList ll = new PalindromeLinkedList();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);
        ll.head.next.next.next = new Node(2);
        ll.head.next.next.next.next = new Node(1);
        ll.print(); //1->2->3->4->5->null
        System.out.println(ll.checkPalindrome());
    }
}