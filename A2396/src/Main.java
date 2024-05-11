import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String [] array = {"G","P","GP","GG"};
        int [] travel ={2,4,3};
        System.out.println(garbageCollection(array,travel));
    }
    public static int garbageCollection(String[] garbage, int[] travel) {
        int mNum=0;
        int gNum=0;
        int pNum=0;
        int mFinal=0;
        int gFinal=0;
        int pFinal=0;
        int time =0;
        for (int i=0;i<garbage.length;i++){
            if (garbage[i].split("M", -1).length - 1>0){
                mFinal = i+1;
                mNum += garbage[i].split("M", -1).length - 1;
            }
            if (garbage[i].split("G", -1).length - 1>0){
                gFinal = i+1;
                gNum += garbage[i].split("G", -1).length - 1;
            }
            if (garbage[i].split("P", -1).length - 1>0){
                pFinal = i+1;
                pNum += garbage[i].split("P", -1).length - 1;
            }
        }
        time = mNum+pNum+gNum;
        if (gFinal>0){
            for (int i=0;i<gFinal-1;i++){
                time += travel[i];
            }
        }
        if (pFinal>0){
            for (int i=0;i<pFinal-1;i++){
                time += travel[i];
            }
        }
        if (mFinal>0){
            for (int i=0;i<mFinal-1;i++){
                time += travel[i];
            }
        }
        return time;

    }
}