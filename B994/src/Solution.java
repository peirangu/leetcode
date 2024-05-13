import java.security.KeyPair;
import java.util.*;

public class Solution {

    public int orangesRotting(int[][] grid) {
        int f = grid.length;
        int s = grid[0].length;
        int max = 0;



        Queue<Integer> queue = new LinkedList<>();
        for (int i =0;i<f;i++){
            for (int j=0;j<s;j++){
                if (grid[i][j]==2){
                    queue.add(i*s+j);
                }
            }
        }

        int fSize = queue.size();
        int[][] color = new int[f][s];
        int[][][] distance = new int[fSize][f][s];
        int[][] predecessors = new int[f][s];



        while(!queue.isEmpty()){
            int l = queue.peek()/s;
            int r = queue.peek()%s;
            int num = fSize-queue.size();
            Queue<Integer> leave = new LinkedList<>();
            Arrays.stream(color).forEach(row -> Arrays.fill(row, 0));
            Arrays.stream(predecessors).forEach(row -> Arrays.fill(row, 0));
            color[l][r] = 1;
            leave.add(queue.peek());
            while (!leave.isEmpty()){
                int t = leave.poll();
                l = t/s;
                r = t%s;
                if (l+1<=f-1 && grid[l+1][r]==1 && color[l+1][r]==0){
                    color[l+1][r] = 1;
                    distance[num][l+1][r] = distance[num][l][r]+1;
                    predecessors[l+1][r] = t;
                    leave.add((l+1)*s+(r));
                }
                if (r-1>=0 && grid[l][r-1]==1 && color[l][r-1]==0){
                    color[l][r-1] = 1;
                    distance[num][l][r-1] = distance[num][l][r]+1;
                    predecessors[l][r-1] = t;
                    leave.add((l)*s+(r-1));
                }
                if (r+1<=s-1 && grid[l][r+1]==1 && color[l][r+1]==0){
                    color[l][r+1] = 1;
                    distance[num][l][r+1] = distance[num][l][r]+1;
                    predecessors[l][r+1] = t;
                    leave.add((l)*s+(r+1));
                }
                if (l-1>=0&& grid[l-1][r]==1 && color[l-1][r]==0){
                    color[l-1][r] = 1;
                    distance[num][l-1][r] = distance[num][l][r]+1;
                    predecessors[l-1][r] = t;
                    leave.add((l-1)*s+(r));
                }
                color[l][r] = 2;
            }
            queue.poll();
        }
        for (int i =0;i<f;i++){
            for (int j=0;j<s;j++){
                if (fSize==0 && grid[i][j]==1){
                    return -1;
                }
                if (fSize>0) {
                    int temp = distance[0][i][j];
                    for (int k = 0; k < fSize; k++) {
                        if (distance[k][i][j]!=0) {
                            if (temp ==0){
                                temp = distance[k][i][j];
                            }
                            else temp = Math.min(distance[k][i][j], temp);
                        }
                    }
                    if ((grid[i][j] == 1 && temp == 0)) {
                        return -1;
                    }
                    max = Math.max(temp, max);
                }
            }
        }
        return max;


    }
}