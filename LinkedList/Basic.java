package LinkedList;

public class Basic {
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
    public static int size;

    public void addFirst(int data){
        //Step 1: Create new node
        Node newNode = new Node(data);
        size++;

        //If head is empty
        if(head == null){
            head = tail = newNode;
            return;
        }

        //Step 2: newNode next = head
        newNode.next = head; //Link

        //Step 3: head = newNode
        head = newNode;
    }
    public void addLast(int data){
        //Step 1: Create new node
        Node newNode = new Node(data);
        size++;

        //If head is empty
        if(head == null){
            head = tail = newNode;
            return;
        }

        //Step 2: tail next = newNode
        tail.next = newNode; //Link

        //Step 3: tail = newNode
        tail = newNode;
    }
    public void print(){ //O(n)
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addMiddle(int index,int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i < index-1){
            temp = temp.next;
            i++;
        }
        // When i = index-1 then temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    // public static void main(String[] args) {
    //     Basic ll = new Basic();
    //     ll.print();
    //     ll.addFirst(2);
    //     ll.print();
    //     ll.addFirst(1);
    //     ll.print();
    //     ll.addLast(3);
    //     ll.print();
    //     ll.addLast(4);
    //     ll.print();
    // }

    public static void main(String[] args) {
        Basic ll = new Basic();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addMiddle(2, 3);
        ll.print(); //1->2->3->4->5->null
        System.out.println("Size of linked list is: "+ll.size);
    }
}