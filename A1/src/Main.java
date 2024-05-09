import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [] array ={2,2,3,3};
        System.out.println(Arrays.toString(twoSum(array, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
       /* int [] array = new int[100];
        int [] returnArray = new int[2];
        int aimValue = -1;
        for (int num:nums){
            array[num] +=1;
        }
        for (int i=0;i<=target/2;i++){
            if (i==target/2 && target%2==0){
                if (array[target/2]>=2){
                    aimValue = i;
                }
            }else {
                if (array[target-i]!=0){
                    aimValue = i;
                }
            }
        }
        if (aimValue==-1){
            return null;
        }
        if (aimValue==target/2 && target%2==0){
            for (int i=0;i<nums.length;i++){
                if (nums[i] == aimValue && returnArray[0]==0){
                    returnArray[0]=i;
                }else {
                    if (nums[i] == aimValue){
                        returnArray[1]=i;
                    }
                }
            }
        }else {
            for (int i=0;i<nums.length;i++){
                if (nums[i] == aimValue){
                    returnArray[0]=i;
                }
            }
            for (int i=0;i<nums.length;i++){
                if (nums[i] == target-aimValue){
                    returnArray[1]=i;
                }
            }

        }
        return returnArray;*/


        /*int n = nums.length;
            for (int i = 0; i < n; ++i) {
                for (int j = i + 1; j < n; ++j) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[0];*/

        int[] array = new int[2];
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (hashMap.containsKey(target-nums[i])){
                array[0] = i;
                array[1] = hashMap.get(target-nums[i]);
                return array;
            }
            hashMap.put(nums[i],i);
        }
        return null;


    }
}
