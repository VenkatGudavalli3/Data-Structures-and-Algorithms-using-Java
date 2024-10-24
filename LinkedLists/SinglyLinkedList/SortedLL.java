public class SortedLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(3);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(5);
        System.out.println("The Original Linked List is: ");
        printList(head);

        head = remove_duplicates(head);

        System.out.println("List After removing duplictes: ");
        printList(head);

        
        head = insertNode(head, 2 );
        head = insertNode(head, 4 );
        head = insertNode(head, 6);

        System.out.println("List After inserting nodes: ");
        printList(head);


        head = removeGivenKey(head, 3);
        head = removeGivenKey(head, 6);
        head = removeGivenKey(head, 1);
        System.out.println("List after removing given key: ");

        printList(head);



    }




        
    //METHODS
    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static Node remove_duplicates(Node head){
        Node curr = head;

        while(curr!=null && curr.next!=null){
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return head;
    }

    // insert a new node in the sorted linked list

    public static Node insertNode(Node head, int new_data){

        Node new_Node = new Node(new_data);

        if(head == null){
            return new_Node;
        }

        Node curr = head;
        Node prev = null;

        while(curr!=null && curr.data<new_Node.data){
            prev = curr;
            curr = curr.next;
        }
        prev.next = new_Node;
        new_Node.next=curr;

        return head;
    }

    public static Node removeGivenKey(Node head, int key){

        Node curr = head;
        Node prev = null;

        if(curr!=null && curr.data == key){
            head = curr.next;
            return head;
        }

        while(curr!=null && curr.data!=key){
            prev = curr;
            curr = curr.next;

        }

        if(curr==null){
            System.out.println("Given key not exists!");
        }

        prev.next = curr.next;
        return head;
    }
    
}
