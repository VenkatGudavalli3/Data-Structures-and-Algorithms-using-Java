package LinkedLists.DoublyLinkedList;

public class DoublyLinkedList {
    private Node  head = null;
    private Node tail = null;
    private int length = 0;

    private class Node {
        private int data;
        private Node prev;
        private Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;

    }

    public boolean isEmpty(){
        return length == 0; //head == null
    }

    public int length(){
        return length;
    }

    public void displayForward(){
        Node temp = head;
        if(head == null){
            return;
        }

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void displaybackward(){
        Node temp = tail;
        if(tail == null){
            return;
        }

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.prev;
        }
        System.out.println("null");
    }

    public void insertFirst(int data){
        Node new_node = new Node(data);
        if(isEmpty()){
            tail = new_node;
        }
        else{
            head.prev = new_node;
        }
        new_node.next = head;
        head = new_node;
        length++;
    }

    public void insertLast(int data){
        Node new_Node = new Node(data);

        if(isEmpty()){
            head = new_Node;
        }
        else{
            tail.next = new_Node;
            new_Node.prev = tail;
        }
        tail = new_Node;
        length++;
    }
    public Node deleteFirstode() throws Exception{

        if(isEmpty()){
            throw new Exception("List is Empty");
        }

        Node temp = head;

        if(head == tail){
            tail = null;
        }
        else{
            head.next.prev = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
        
    }
    public Node deleteLastNode() throws Exception{
        
        if(isEmpty()){
            throw new Exception("No Elemenets left.");
        }
        Node temp = tail;
        if(head == tail){
            head = null;
        }
        else{
            tail.prev.next = null;
        }

        tail = tail.prev;
        temp.prev = null;
        length--;
        return temp;
    }

    public static void main(String[] args) throws Exception {
        DoublyLinkedList dl = new DoublyLinkedList();

        dl.insertFirst(10);
        dl.insertFirst(5);

        dl.insertLast(15);
        dl.insertLast(20);

        //dl.deleteFirstode();
        //dl.deleteFirstode();
        //dl.deleteFirstode();
        //dl.deleteFirstode();
        //dl.deleteFirstode();

        //dl.deleteLastNode();
        //dl.deleteLastNode();
        //dl.deleteLastNode();
        //dl.deleteLastNode();
        //dl.deleteLastNode();

        dl.displayForward();
        //dl.displaybackward();

        System.out.println(dl.length());
    }

}
