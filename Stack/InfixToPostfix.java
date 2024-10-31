package Stack;
import java.util.Stack;

public class InfixToPostfix {

    // infix: "a+b*c+d"
    // postfix: "abc*+d+"
    public static int prec(char c){
        if(c == '^'){
            return 3;
        }
        else if(c == '*' || c == '/'){
            return 2;
        }
        else if(c == '+' || c == '-'){
            return 1;
        }
        else{
            return -1;
        }
        
    }

    public static String infix_to_postfix(String str){
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        
        for(int i = 0; i< str.length(); i++){
            char c = str.charAt(i);

            //if character is operand
            if((c>='a'&& c<='z')||(c>='A'&& c<='Z')||(c>='0'&& c<='9')){
                res.append(c);
            }

            //if character is '('
            else if(c == '('){
                stack.push('(');
            }

            //if character is ')'
            else if(c == ')'){
                while(stack.peek()!='('){
                    res.append(stack.pop());
                }
                stack.pop();
            }

            //if character is operator
            else{
                while(!stack.isEmpty() && (prec(c)<prec(stack.peek()) || prec(c)==prec(stack.peek()))){
                    res.append(stack.pop());
                }
                stack.push(c);

            }


        }
        // pop the remaininig elements
            
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.toString();
    }
    public static void main(String[] args) {

        String str = "a+b*c+d";

        System.out.println(infix_to_postfix(str));

        
        
    }
    
}

//  Time Complexity: O(N), where N is the size of the infix expression
