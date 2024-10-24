//import java.util.Arrays;
public class ArrResize {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(arr.length);

        int capacity = 8;

        arr = resize(arr,capacity);

        System.out.println(arr.length);


    }
    public static int[] resize(int[] arr,int capacity){
        int[] temp = new int[capacity];

        for(int i = 0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        return temp;
    }

}