public class Main {
    public static void main(String[] args) {
        int[][] test = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(test));
    }
    public static int maximumWealth(int[][] accounts) {
        int[] totalWealth = new int[accounts.length];
        for (int i=0;i<accounts.length;i++){
            int[] currentArray = accounts[i];
            int wealth=0;
            for (int money:currentArray){
                wealth += money;
            }
            totalWealth[i] = wealth;
        }
        int maximumWealth = 0;
        for (int wealth: totalWealth){
            if (wealth>=maximumWealth){
                maximumWealth = wealth;
            }
        }
        return maximumWealth;
    }
}