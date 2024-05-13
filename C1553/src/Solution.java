import java.util.HashMap;

public class Solution {
    private HashMap<Integer,Integer> hashMap = new HashMap<>();
    public int minDays(int n) {
        if (n<=1){
            return n;
        }
        if (hashMap.containsKey(n)){
            return hashMap.get(n);
        }
        hashMap.put(n,Math.min(n%2+1+minDays(n/2),n%3+1+minDays(n/3)));
        return hashMap.get(n);
    }
}
