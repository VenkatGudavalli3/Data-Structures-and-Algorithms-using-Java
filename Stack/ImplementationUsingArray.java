package Stack;

class stack {

    static final int MAX = 1000;
    int top;

    int[] a = new int[MAX];

    stack(){
        top = -1;
    }


    public boolean isEmpty(){

       return (top<0);

    }
    

    public boolean push(int x){
        if(top>MAX-1){
            System.out.println("Stack Overflow Condition.");
            return false;
        }
        else{
            a[++top]=x;
            System.out.println(x+" pushed into the stack.");
            return true;
        }
    }

    public int pop(){

        if(top<0){
            System.out.println("Stack Underflow condition.");
            return 0;
        }
        else{
            int x = a[top--];
            return x;
        }
        
    }
    
    public int peek(){
        if(top<0){
            System.out.println("Stack Underflow condition.");
            return 0;
        }
        else{
            int x = a[top];
            return x;
        }

    }

    public void printStack(){
        for(int i=top; i>-1;i--){
            System.out.print(" "+a[i]);
        }
    }
}

public class ImplementationUsingArray{
    public static void main(String[] args) {
        stack s = new stack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop()+" is popped from the stack.");
        System.out.println("Top element is: "+s.peek());
        System.out.print("The elements in the stack: ");
        s.printStack();
    }
}
