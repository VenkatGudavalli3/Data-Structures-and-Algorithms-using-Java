import java.util.Stack;
class Node{

    int data;
    Node next;

    Node(int new_data){

        this.data = new_data;
        this.next = null;

    }
}

public class LLReverseStack{

    public static Node iterative_reverse(Node head){
        
        Stack<Node> stack = new Stack<>();

        Node temp = head;

        while(temp!=null){

            stack.push(temp);
            temp = temp.next;

        }

        if(!stack.isEmpty()){

            head = stack.pop();
            temp = head;

            while(!stack.isEmpty()){

                temp.next = stack.pop();
                temp = temp.next;

            }

            temp.next = null;
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

        head = iterative_reverse(head);

        printList(head);


        
    }
    
    

}
