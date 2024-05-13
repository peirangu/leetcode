import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minDays(280));
    }
    /*public static int minDays(int n) {
        *//*int days =0;*//*
        *//*if (n == 1){
            return 1;
        }
        int i=0;
        int j =0;
        int k=0;
        int l=0;
        while (i<n){
            if ((n-1)/Math.pow(3,i)%3 == 0){
                i++;
            }
            else break;
        }
        while (k<n){
            if ((n)/Math.pow(3,i)%3 == 0){
                k++;
            }
            else break;
        }
        while (j<n){
            if ((n)/Math.pow(2,i)%2 == 0){
                j++;
            }
            else break;
        }
        while (l<n){
            if ((n-1)/Math.pow(2,i)%2 == 0){
                l++;
            }
            else break;
        }



        if ((n%2!=0 && n%3!=0)||((n-1)%3==0 && Math.pow(3,i)>Math.pow(2,j))||((n-1)%2==0 && Math.pow(2,l)>Math.pow(3,k))){
            days += minDays(n-1)+1;
        }else
        if (n%3==0){
            days += minDays(n/3)+1;
        }else
        if (n%2==0){
            days += minDays(n/2)+1;
        }
        return days;*//*



    }*/
}