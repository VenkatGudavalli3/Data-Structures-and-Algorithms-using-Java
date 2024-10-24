public class LLNthNode {

    // MAIN METHOD
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println("The Linked List is: ");
        printList(head);
        int index = 3;

        //int data = iterative_approach(head, index);
        int data =recursive_apprpach(head, index);
        System.out.println(data);

        if(data!=-1){
            System.out.println("The data present at index "+index+" is: "+data);
        }
        else{
            System.out.println("Index doesn't exists!!!");
        }

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


    public static int iterative_approach(Node head, int index){
        Node curr = head;
        int count = 1;
        
        while(curr != null){
            if(count == index){
                return curr.data;
            }
            curr = curr.next;
            count++;
        }
        
        return -1;
    }

    public static int recursive_apprpach(Node head, int index){
        if(head == null){
            return -1;
        }
        if(index == 1){
            return head.data;
        }

        return recursive_apprpach(head.next, index-1);

    }
}
