class Node{

    int data;
    Node next;

    Node(int new_data){

        this.data = new_data;
        this.next = null;

    }
}

public class LinkedList{

    public static Node insertAtBegining(Node head, int new_data){

        Node new_node = new Node(new_data);

        new_node.next = head;

        return new_node;
    }

    public static void printList(Node head){

        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        printList(head);
        System.out.println();


        int data = 1;
        head = insertAtBegining(head, data);

        printList(head);


        System.out.println();

        System.out.println(head);
        System.out.println(head.next);
        System.out.println(head.next.next);
        System.out.println(head.next.next.next);
        System.out.println(head.next.next.next.next);
        
    }
    
    

}