public class LLDelNode {
    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List: ");
        printList(head);
        System.out.println();

        //To perform delete First Node

        //head = deleteFirstNode(head);
        //head = deleteFirstNode(head);
        //head = deleteFirstNode(head);

    
        //To perform delete Last Node

        //head=deleteLastNode(head);
        //head=deleteLastNode(head);
        //head=deleteLastNode(head);
        //head=deleteLastNode(head);
        //head=deleteLastNode(head);
        

        //head = deleteNOdeAtGivenPosition(head, 1);
        //head = deleteNOdeAtGivenPosition(head, 1);
        //head = deleteNOdeAtGivenPosition(head, 2);
        head = deleteNOdeAtGivenPosition(head, 1);
        System.out.println("List After Deletion: ");
        printList(head);
        

    }
    public static void printList(Node head){
        Node curr = head;

        while(curr!=null){

            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.print("null");
    }
    public static Node deleteFirstNode(Node head){
        if(head == null){
            return null;
        }

        Node temp = head;
        head = head.next;
        temp.next= null;

        return head;
    }
    public static Node deleteLastNode(Node head){

        if(head == null || head.next==null){
            return null;

        }
        Node curr = head;
        Node prev = null;

        while(curr.next!=null){
            prev = curr;
            curr=curr.next;
        }
        prev.next= null;
        return head;
    }

    public static Node deleteNOdeAtGivenPosition(Node head, int position){
        if(head==null){
            return head;
        }
        if(position==1){
            head = head.next;
            return head;
        }

        Node prev = null;
        Node curr = head;

        for(int i = 1;i<position&&curr!=null;i++){
            prev = curr;
            curr=curr.next;
        }
        if(curr==null){
            System.out.println("Invalid Position");
        }
        prev.next = curr.next;
        curr = null;
        return head;
    }
}
