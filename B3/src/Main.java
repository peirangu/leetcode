import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcac"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int longest =0;
        Queue<Character> characters = new LinkedList<>();
        for (int i=0;i<s.length();i++){
            if (characters.contains(s.charAt(i))){
                while (characters.contains(s.charAt(i))){
                    characters.poll();
                }
            }
            characters.add(s.charAt(i));
            if (characters.size()>longest){
                longest= characters.size();
            }
        }
        return longest;
    }
}