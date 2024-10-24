class Node{

    int data;
    Node next;

    Node(int new_data){

        this.data = new_data;
        this.next = null;

    }
}

public class LLSearch{

    public static boolean searchElement(Node head, int key){

        Node curr = head;
        while(curr!=null){
            if(curr.data == key){
                return true;
            }
            curr = curr.next;
        }
        return false;
        
    }



    public static void main(String[] args) {
        
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);


        int key = 4;
        if(searchElement(head, key)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        
    }
    
    

}