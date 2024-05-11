public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        char[] string = String.valueOf(x).toCharArray();
        int left;
        int right=string.length-1;
        for (left =0 ;left<right;left++){
            if (string[left]!=string[right]){
                return false;
            }
            right--;

        }
        return true;

    }
}