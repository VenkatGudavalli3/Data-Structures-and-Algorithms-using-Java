public class ArrSecMax {
    public static void main(String[] args) {
        int[] arr = {1,5,6,4,11,6,10,3};
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){

                sec_max = max;
                max = arr[i];
            }
            else if(arr[i]>sec_max && arr[i]!=sec_max){
                sec_max= arr[i];
            }
        }
        System.out.println(sec_max);

    }

}
