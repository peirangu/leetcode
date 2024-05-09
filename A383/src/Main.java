public class Main {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa","aab"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        int [] array = new int[26];


        for (char c:magazine.toCharArray()){
            array[(int) c -97]+=1;
        }
        for (char c:ransomNote.toCharArray()){
            array[(int) c -97]-=1;
            if (array[(int) c -97]<0){
                return false;
            }
        }
        return true;
    }
}