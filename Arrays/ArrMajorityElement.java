import java.util.*;
import java.util.HashMap;

public class ArrMajorityElement{
    public static void main(String[] args){
        int[] arr = {2,2,1,1,1,1,2,2,2};

        System.out.println(majorityElement(arr));

    }

    public static int majorityElement(int[] arr){

        Map<Integer,Integer> map = new HashMap<>();

        int n = arr.length;
        for(int i = 0;i<n;i++){

            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);


        }
        n = n/2;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>n){
                return entry.getKey();
            }
        }
        return 0;
    }

    

}