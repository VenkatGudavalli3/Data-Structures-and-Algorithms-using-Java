import java.util.Arrays;
public class ArrRemovalOfEvenIntegers {
    public static void main(String[] args) {
        int[] arr = {3,2,4,7,10,6,5};
        int oddCount = 0;
        for(int i = 0 ; i<arr.length;i++){

            if(arr[i]%2!=0){
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int j = 0;
        for(int i = 0 ; i<arr.length;i++){

            if(arr[i]%2!=0){
                result[j]=arr[i];
                j++;
            }
        }




        System.out.println(Arrays.toString(result));
    }
}
