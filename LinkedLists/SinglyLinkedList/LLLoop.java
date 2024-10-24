public class LLLoop {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        head.next.next.next.next.next.next = head.next.next;
        //System.out.println("The Original Linked List is: ");
        //printList(head);

        System.out.println(checkLoop(head));
        System.out.println(getStartingNodeOfLoop(head).data);
        removeLoop(head);

        System.out.println("List after removing loop: ");
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

    public static boolean checkLoop(Node head){
        Node fast_ptr = head;
        Node slow_ptr = head;

        while(fast_ptr!=null && fast_ptr.next != null){

            fast_ptr=fast_ptr.next.next;
            slow_ptr=slow_ptr.next;

            if(fast_ptr==slow_ptr){
                return true;
            }
        }
        return false;
    }

    public static Node getStartingNodeOfLoop(Node head){
        Node slow_ptr = head;
        Node fast_ptr = head;

        while(fast_ptr!=null && fast_ptr.next!=null){
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;

            if(slow_ptr==fast_ptr){
                return getStartNode(slow_ptr,head);
            }
        }
        return null;
    }

    public static Node getStartNode(Node slow_ptr, Node head){
        Node temp  = head;

        while(slow_ptr!=temp){

            temp=temp.next;
            slow_ptr=slow_ptr.next;

        }
        return temp;
    }

    public static void removeLoop(Node head){
        Node fast_ptr = head;
        Node slow_ptr = head;

        while(fast_ptr!=null&&fast_ptr.next!=null){

            fast_ptr=fast_ptr.next.next;
            slow_ptr=slow_ptr.next;

            if(slow_ptr==fast_ptr){
                remove(slow_ptr,head);
                return;
                //return head;
            }

        }
        //return null;
    }

    public static void remove(Node slow_ptr,Node head){
        Node temp = head;

        while(temp.next!=slow_ptr.next){
            temp=temp.next;
            slow_ptr=slow_ptr.next;
        }
        slow_ptr.next=null;
    }
    
}
