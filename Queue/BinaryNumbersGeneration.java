package Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumbersGeneration {

    public static String[] generate_binary_numbers(int n){

        String[] result = new String[n];
        Queue<String> q = new LinkedList<String>();
        q.offer("1");

        for(int i = 0;i < n;i++){

            String n1 = q.peek()+"0";
            String n2 = q.peek()+"1";
            q.offer(n1);
            q.offer(n2);

            result[i]=q.poll();
     
        }
        return result;

    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(generate_binary_numbers(11)));

    }
    
}
