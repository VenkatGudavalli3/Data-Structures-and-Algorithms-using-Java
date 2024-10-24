class Node{

    int data;
    Node next;

    Node(int new_data){

        this.data = new_data;
        this.next = null;

    }
}

public class LLSearch1{

    public static boolean searchElement(Node head, int key){

        if(head == null){
            return false;
        }

        if(head.data == key){
            return true;
        }

        return searchElement(head.next, key);
        
    }



    public static void main(String[] args) {
        
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);


        int key = 1;
        if(searchElement(head, key)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        
    }
    
    

}