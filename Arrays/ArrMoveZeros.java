import java.util.Arrays;
public class ArrMoveZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,4,12};
        int n = arr.length;

        //{1,4,12,0,0}
        int j = 0;
        
        for(int i=0;i<n;i++){
            
            if(arr[i]!=0 && arr[j]==0){

                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]= temp;

            }
            if(arr[j]!=0){
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
