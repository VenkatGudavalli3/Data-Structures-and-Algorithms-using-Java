package Stack;
import java.util.Stack;

public class Validparenthesis {

    // {}[]() - true
    //[{( - false
    //[][ - false

    public static boolean valid(String s){
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c=='{' || c=='[' || c == '('){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    Character top = stack.peek();
                    if(c == ')' && top == '(' || c == '}' && top == '{' || c == ']' && top == '['){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
            
        }
        return stack.isEmpty();


    }

    public static void main(String[] args) {

        String s = "[{]}";
        if(valid(s)){
            System.out.println("Valid Parenthesis!");
        }
        else{
            System.out.println("Invalid Parenthesis!");
        }
        
    }
}
