package LinkedLists.CircularLinkedList;

public class CircularSinglyLL {

    private Node last;
    private int length;

    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public CircularSinglyLL(){
        last = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public void createCircularLL(){
        Node first = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);
        Node fourth = new Node(20);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next =  first;
        last = fourth;
    }
    public void display(){
        if(last == null){
            return;
        }

        Node first = last.next;

        while(first!=last){
            System.out.print(first.data+" ");
            first = first.next;
        }
        System.out.print(first.data);
    }

    public void insertFirst(int data){
        Node temp = new Node(data);

        if(last == null){
            last = temp;
        }
        else{
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }

    public void insertLast(int data){
        Node temp = new Node(data);

        if(last == null){
            last = temp;
            last.next = last;
        }
        else{
            temp.next = last.next;
            last.next = temp;
            last = temp;
        } 
        length++;   
    }




    public static void main(String[] args) {
        CircularSinglyLL cl = new CircularSinglyLL();
        //cl.createCircularLL();
        //cl.insertFirst(20);
        //cl.insertFirst(15);
        //cl.insertFirst(10);
        //cl.insertFirst(5);

        cl.insertLast(5);
        cl.insertLast(10);
        cl.insertLast(15);
        cl.insertLast(20);

        cl.display();

        
    }
}
