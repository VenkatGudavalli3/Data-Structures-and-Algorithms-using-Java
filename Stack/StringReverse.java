package Stack;
import java.util.Stack;

public class StringReverse {

    public static String reverse(String str){
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();

        for(char e : chars){
            stack.push(e);
        }

        for(int i = 0;i<str.length();i++){
            chars[i]=stack.pop();
        }
        return new String(chars);
    }



    public static void main(String[] args) {
        String str = "BATMAN";
        System.out.println("String before reverse: "+str);
        System.out.println("String after reverse: "+reverse(str));

    }
    
}
