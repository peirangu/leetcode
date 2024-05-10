import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array ={1,1,2,1,3};
        System.out.println(countTestedDevices(array));
    }
    public static int countTestedDevices(int[] batteryPercentages) {
        int testTime = 0;
        int i;
        for (i=0;i<batteryPercentages.length;i++){
            final int j = i;
            if (batteryPercentages[j]>0){
                Arrays.parallelSetAll(batteryPercentages,k->(k>j)?Math.max(0,batteryPercentages[k]-1):batteryPercentages[k]);
                testTime++;
            }

        }
        return testTime;
    }
}