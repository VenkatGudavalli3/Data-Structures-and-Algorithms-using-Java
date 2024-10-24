public class LLNthNodeFromEnd {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println("The Linked List is: ");
        printList(head);

        //int data = iterative_approach(head, 06);
        int data = two_pointer_approach(head, 1);

        System.out.println(data);
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

    public static int iterative_approach(Node head, int N){
        int len = 0;
        Node curr = head;
        while(curr!=null){
            len++;
            curr = curr.next;
        }


        if(N>len){
            return -1;
        }

        curr = head;

        for(int i = 1;i<len-N+1;i++){
            curr = curr.next;
        }

        return curr.data;

      
    }
    public static int two_pointer_approach(Node head, int N){

        Node main_ptr = head;
        Node ref_ptr = head;

        for(int i = 1;i<N;i++){
            ref_ptr=ref_ptr.next;

            if(ref_ptr==null){
                return -1;
            }
        }

        while(ref_ptr.next!=null){
            main_ptr=main_ptr.next;
            ref_ptr=ref_ptr.next;
        }
        return main_ptr.data;
    
    }

}
