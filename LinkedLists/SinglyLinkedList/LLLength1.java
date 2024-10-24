class Node{

    int data;
    Node next;

    Node(int new_data){

        this.data = new_data;
        this.next = null;

    }
}

public class LLLength1{

    public static int length_Recursive(Node head){
        
        if(head == null )
            return 0;

        return 1 + length_Recursive(head.next);
        
    }



    public static void main(String[] args) {
        
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        System.out.println(length_Recursive(head));


        
    }
    
    

}