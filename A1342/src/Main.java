public class Main {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(3));

    }
    public static int numberOfSteps(int num) {
        int steps = 0;
        if (num != 0){
            if (num%2==1){
                steps = steps + numberOfSteps(num-1);

            }
            else{
                steps = steps + numberOfSteps(num/2);
            }
            return steps+1;
        }
        return steps;
    }
}