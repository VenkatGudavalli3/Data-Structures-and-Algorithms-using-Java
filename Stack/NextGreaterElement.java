package Stack;
import java.util.Stack;
import java.util.Arrays;

public class NextGreaterElement {

    public static int[] next_Greater_Element(int[] arr){
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        // 4,7,3,4,8,1
        // 7,8,4,8,-1,-1

        for(int i = arr.length-1;i>=0;i--){
            if(!stack.isEmpty()){
                while(!stack.isEmpty()&&stack.peek()<=arr[i]){
                    stack.pop();
                }

            }
            if(stack.isEmpty()){
                res[i] = -1;
            }
            else{
                res[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;

    
    
    }
    public static void main(String[] args) {

        int[] arr = {4,7,3,4,8,1};
        System.out.println(Arrays.toString(next_Greater_Element(arr)));
        
    }
}
