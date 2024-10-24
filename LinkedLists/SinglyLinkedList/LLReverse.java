class Node{

    int data;
    Node next;

    Node(int new_data){

        this.data = new_data;
        this.next = null;

    }
}

public class LLReverse{

    public static Node iterative_reverse(Node head){
        
        Node curr = head, prev = null, next;

        while(curr!=null){
            next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
        
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

        System.err.println();

        head = iterative_reverse(head);

        printList(head);


        
    }
    
    

}