import java.util.*;

class Solution {
    static boolean done = false;
    static int max = 0;
    static boolean[] visit;
    
    static void dfs(int depth, int curr, int[][] mat) {
        if (done) return;
        
        if (depth>max) max = depth;
        
        if (depth==mat.length) {
            max = mat.length;
            done = true;
            return;
        }
        
        for (int idx=0; idx<mat.length; idx++) {
            if (curr>=mat[idx][0] && !visit[idx]) {
                visit[idx] = true;
                dfs(depth+1, curr-mat[idx][1], mat);
                visit[idx] = false;
            }
        }
    }
    
    public int solution(int k, int[][] dungeons) {
        visit = new boolean[dungeons.length];
        dfs(0, k, dungeons);
        return max;
    }
}
