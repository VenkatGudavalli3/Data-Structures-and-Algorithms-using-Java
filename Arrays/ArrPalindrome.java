public class ArrPalindrome {
    public static void main(String[] args) {
        String str = " mada  m";
        str = str.trim().replaceAll(" ", "");
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome_while(str));

    }
    public static boolean isPalindrome(String str){
        
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
                
            }
            System.out.println(i);

        }
        return true;

        
    }
    public static boolean isPalindrome_while(String str){
        
        int start = 0;
        int end = str.length()-1;

        while (start<end) {
            if(str.charAt(start)!=str.charAt(end)){
                return false;
                
            }
            System.out.println(start +" "+ end);
            
            start++;
            end--;
            
        }
        return true;

        
    }
}
