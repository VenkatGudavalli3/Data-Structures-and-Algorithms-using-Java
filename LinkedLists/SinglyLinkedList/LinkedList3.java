class Node{

    int data;
    Node next;

    Node(int new_data){

        this.data = new_data;
        this.next = null;

    }
}

public class LinkedList3{

    public static Node insertBeforeGivenNode(Node head, int key, int new_data){

        //Empty list
        if(head == null){
            return null;
        }
        //key is the head element of the list

        if(head.data == key){
            Node new_node = new Node(new_data);
            new_node.next = head;
            return new_node;
        }

        Node curr = head;
        Node prev = null;

        while(curr!=null && curr.data != key){
            prev = curr;
            curr = curr.next; 
        }

        if(curr!= null){
            Node new_node = new Node(new_data);

            prev.next = new_node;
            new_node.next = curr;

        }
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


        int data = 1, key = 3;
        head = insertBeforeGivenNode(head, key, data);

        printList(head);


        System.out.println();

        System.out.println(head);
        System.out.println(head.next);
        System.out.println(head.next.next);
        System.out.println(head.next.next.next);
        System.out.println(head.next.next.next.next);
        
    }
    
    

}