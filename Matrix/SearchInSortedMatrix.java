package Matrix;

public class SearchInSortedMatrix {

    // Using two loops. Time Complexity O(n^2)
    // Not an optimized solution ☹️

    public static boolean search(int[][] matrix, int key){
        for(int i = 0; i < 3;i++){
            for(int j = 0; j<3; j++){
                if(matrix[i][j]==key){
                    return true;
                }
            }
        }
        return false;
    }

    // Optimized Solution

    public static void optimized_search(int[][] matrix, int key, int n){
        int i = 0;
        int j = n-1;

        while(i<n && j>=0){
            if(matrix[i][j]==key){
                System.out.println("Key is found at index "+i+","+j);
                return;
            }
            if(matrix[i][j]>key){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("Key is not found.");
    }

    public static void main(String[] args) {
        
        int[][] matrix ={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,51}};
        
        int key = 33;
        
        /*boolean res = search(matrix, key);

        if(res){
            System.out.println("key is present in the matrix.");
        }else{
            System.out.println("key is not found in the matrix.");
        } */

        optimized_search(matrix, key, matrix.length);
    }
}
