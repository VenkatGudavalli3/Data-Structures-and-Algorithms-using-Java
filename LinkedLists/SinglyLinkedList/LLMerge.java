public class LLMerge {
    public static void main(String[] args) {
         Node a = new Node(1);
         a.next = new Node(3);
         a.next.next = new Node(5);
         a.next.next.next = new Node(7);

         Node b = new Node(2);
         b.next = new Node(4);
         b.next.next = new Node(6);

         printList(a);
         printList(b);
         Node head = merge(a, b);

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

    public static Node merge(Node a, Node b){
        //Node dummy = new Node(0);
        //Node tail = dummy;

        Node head = null;

        if(a.data<=b.data){
            head = a;
            a = a.next;
        }
        else{
            head = b;
            b=b.next;
        }
        Node tail = head;

        while(a!=null && b!=null){
            if(a.data <= b.data){
                tail.next = a;
                a = a.next;
            }
            else{
                tail.next = b;
                b=b.next;
            }
            tail=tail.next;
        }
        if(a==null){
            tail.next = b;
        }
        else{
            tail.next = a;
        }
        //return dummy.next;
        return head;
    }
}
