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
        System.out.println(first.data);
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

    public Node deleteFirst() throws Exception {
        
        if(isEmpty()){

            throw new Exception("No Elements to delete.");

        }

        Node temp = last.next;
        if(last.next == last){
            last = null;
        }
        else{
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return temp;
    }

    public Node delelteLast() throws Exception{
        if(isEmpty()){
            throw new Exception("No elements to delete.");
        }
        Node first = last.next;

        if(last == last.next){
            last = null;
        }
        else{
            while(first.next != last){
                first = first.next;
            }
            first.next = last.next;
            last.next = null;
            last = first;
        }
        length--;
        return last;
        
    }

    public boolean searching(int key){
        if(isEmpty()){
            return false;
        }
        if(last.data ==  key){
            return true;
        }
        Node first = last.next;

        while(first!=last){
            if(first.data == key){
                return true;
            }
            first = first.next;
        }
        return false;
    }





    public static void main(String[] args) throws Exception {
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

        //cl.deleteFirst();
        //cl.deleteFirst();
        //cl.deleteFirst();
        //cl.deleteFirst();
        //cl.deleteFirst();

        //cl.delelteLast();
        //cl.delelteLast();
        //cl.delelteLast();
        //cl.delelteLast();
        //cl.delelteLast();
        //System.out.println(cl.length());

        System.out.println(cl.searching(25));


        //cl.display();

        
    }
}
