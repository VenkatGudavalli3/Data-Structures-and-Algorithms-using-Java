class Node{

    int data;
    Node next;

    Node(int new_data){

        this.data = new_data;
        this.next = null;

    }
}

public class LinkedList1{

    public static Node insertAfterGivenNode(Node head, int key, int new_data){

        
        Node curr = head;
        while(curr != null){
            if(curr.data == key){
                break;
                
            }
            curr = curr.next;
        }

        if(curr == null){
            return head;
        }

        Node new_node = new Node(new_data);
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


        int data = 1, key = 3;
        head = insertAfterGivenNode(head, key, data);

        printList(head);


        System.out.println();

        System.out.println(head);
        System.out.println(head.next);
        System.out.println(head.next.next);
        System.out.println(head.next.next.next);
        System.out.println(head.next.next.next.next);
        
    }
    
    

}