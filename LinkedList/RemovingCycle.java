package LinkedList;

public class RemovingCycle {
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

    //Floyd's Cycle Finding Algorithm
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(slow == fast){
                return true; //Cycle exist
            }
        }
        return false; //Cycle doesn't exist
    }

    public static void removeCycle(){
        //Detect Cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(fast == slow){
                cycle = true; //Cycle exist
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        //Find Meeting Point
        slow = head;
        Node prev = null; //Last Node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //Remove Cycle => last.next = null;
        prev.next = null;
    }
    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = temp;
        //1->2->3->4->2 
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}