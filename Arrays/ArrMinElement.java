import java.util.Arrays;
public class ArrMinElement {

    public static void main(String[] args) throws Exception {
        
        int[] arr = {1,3,5,6,7};

        if(arr==null || arr.length==0){
            throw new Exception("Invalid input");
        }

        int min = arr[0];
        for(int i =1;i<arr.length;i++){

            if(arr[i]<min){
                min = arr[i];
            }

        }
        System.out.println(min);

        Arrays.sort(arr);
        System.out.println(arr[0]);


    }
    
}
