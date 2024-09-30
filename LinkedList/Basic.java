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
    public int removeFirst(){
        if(size == 0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val; 
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size == 0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val; 
        }
        //Previous: i = size - 2
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = head.next.data; //Tail Data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int iterativeSearch(int key){ //O(n)
        Node temp = head;
        int i=0;

        while (temp != null) {
            if(temp.data == key){ //Key Found
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1; //Key Not Found
    }
    public int helper(Node head,int key){ //Real Recursive Function //O(n)
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int index = helper(head.next, key);
        if(index == -1){
            return -1;
        }
        return index+1;
    }
    public int recursiveSearch(int key){
        return helper(head, key);
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

    // public static void main(String[] args) {
    //     Basic ll = new Basic();
    //     ll.addFirst(2);
    //     ll.addFirst(1);
    //     ll.addLast(4);
    //     ll.addLast(5);
    //     ll.addMiddle(2, 3);
    //     ll.print(); //1->2->3->4->5->null
    //     System.out.println("Size of linked list is: "+ll.size);
    //     ll.removeFirst();
    //     ll.print();
    //     System.out.println("Size of linked list is: "+ll.size);
    //     ll.removeLast();
    //     ll.print();
    //     System.out.println("Size of linked list is: "+ll.size);
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

        System.out.println(ll.iterativeSearch(3));
        System.out.println(ll.iterativeSearch(10));

        System.out.println(ll.recursiveSearch(3));
        System.out.println(ll.recursiveSearch(10));
    }
}