class Node{

    int data;
    Node next;

    Node(int new_data){

        this.data = new_data;
        this.next = null;

    }
}

public class LinkedList4{

    public static Node insertAtSpecPos(Node head, int position, int new_data){

        Node new_node = new Node(new_data);

        if(position == 1){
            new_node.next = head;
            head = new_node;
            return head;
        }

        Node curr = head;

        for(int i = 1; i<position-1 && curr != null ; i++){
            curr = curr.next;
        }

        if(curr == null){
            System.out.println("Position is out of bounds!");
        }

        new_node.next = curr.next;
        curr.next = new_node;
        return head;


    }

    public static void printList(Node head){

        Node curr = head;
        while(curr!=null){
            System.out.print(" "+ curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        printList(head);
        System.out.println();


        int data = 1, position = 1;
        head = insertAtSpecPos(head, position, data);

        printList(head);


        System.out.println();

        System.out.println(head);
        System.out.println(head.next);
        System.out.println(head.next.next);
        System.out.println(head.next.next.next);
        System.out.println(head.next.next.next.next);
        
    }
    
    

}