package Stack;
import java.util.Stack;

public class PrefixToInfix {

    static boolean isOperator(char c){
        switch(c){
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                return true;
        }
        return false;
    }

    static String prefix_to_infix(String str){

        //Input: *+ab-cd
        //output: (a+b)*(c-d)
        Stack<String> stack = new Stack<>();
        int l = str.length()-1;

        for(int i = l; i>=0; i--){
            char c = str.charAt(i);

            // if character is operator
            if(isOperator(c)){
                String opr1 = stack.pop();
                String opr2 = stack.pop();
                String res = '('+opr1+c+opr2+')';
                stack.push(res);
            }
            else{
                // to convert character to string
                stack.push(c+"");
            }
           
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        //String str = "*+AB-BC";
        String str = "*-A/BC-/AKL";

        System.out.println("Infix:" +prefix_to_infix(str));
        
    }
    
}


// Time Complexity: O(n) where 'n' is the size of the string
