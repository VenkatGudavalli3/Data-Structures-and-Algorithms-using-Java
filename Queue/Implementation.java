package Queue;

public class Implementation {

    private ListNode front;
    private ListNode rear;
    private int length;

    public Implementation(){
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int Length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    // insertion of a new node takes place at rear end 

    public void enqueue(int data){
        ListNode temp = new ListNode(data);

        if(isEmpty()){
            front = temp;
        }else{
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    public int dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty!");
        }
        int result = front.data;
        front = front.next;

        if(front == null){
            rear = null;
        }
        length--;
        return result;
    }

    public void printQueue(){
        if(isEmpty()){
            return;
        }
        ListNode curr = front;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public int first() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty!");
        }
        return front.data;
    }

    public int last() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty!");
        }
        return rear.data;
    }
    
    public static void main(String[] args) throws Exception {

        Implementation q = new Implementation();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        
        System.out.println(q.first());
        System.out.println(q.last());

        //System.out.println(q.dequeue());
        //System.out.println(q.dequeue());
        //System.out.println(q.dequeue());
        //System.out.println(q.dequeue());
        //System.out.println(q.dequeue());
        System.out.println(q.Length());
        q.printQueue();
        
    }
}
