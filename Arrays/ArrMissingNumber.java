public class ArrMissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,4,2,6,7,8,9,5};

        int n = arr.length+1;

        int sum = (n*(n+1))/2;

        for(int i = 0; i<arr.length;i++){
            sum -= arr[i];
        }

        System.out.println(sum);
    }
}
