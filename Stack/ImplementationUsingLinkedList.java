package Stack;

public class ImplementationUsingLinkedList {

    private ListNode top;
    private int length;

    private class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data){

            this.data = data;

        }
    }

    public ImplementationUsingLinkedList(){
        top = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty!");
        }

        int result = top.data;
        top = top.next;
        return result;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty! No Peek Element.");
        }

        return top.data;
    }


    public static void main(String[] args) throws Exception {

        ImplementationUsingLinkedList s = new ImplementationUsingLinkedList();
        s.push(10);
        s.push(20);
        s.push(30);
        
        System.out.println(s.peek()+" is the peek element.");

        System.out.println(s.pop()+" is popped from the stack.");

        System.out.println(s.peek()+" is the peek element.");
        
    }
}
