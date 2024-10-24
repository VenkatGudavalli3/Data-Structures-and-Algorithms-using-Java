public class LLSum {
    public static void main(String[] args) {
        Node a = new Node(7);
        a.next = new Node(4);
        a.next.next = new Node(9);

        Node b = new Node(5);
        b.next = new Node(6);

        printList(a);
        printList(b);

        Node head = addTwoLists(a, b);
        printList(head);


    }

    public static void printList(Node head){
        Node curr = head;

        while(curr!=null){
            System.out.print(curr.data+ "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static Node addTwoLists(Node a, Node b){
        Node dummy = new Node(0);
        Node temp = dummy;
        int carry = 0;

        while(a!=null|| b!=null){

            int x = (a!=null) ? a.data : 0;
            int y = (b!=null) ? b.data : 0;

            int sum = x + y + carry;

            carry = sum / 10;
            temp.next = new Node(sum%10);
            temp= temp.next;

            if(a!=null){
                a = a.next;
            }
            if(b!=null){
                b=b.next;
            }

        }
        if(carry>0){
            temp.next = new Node(carry);
        }

        return dummy.next;


    }
}
