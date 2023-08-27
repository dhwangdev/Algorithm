import java.util.*;

class Solution {
    public int solution(int col, int row, int[][] puddles) {
        int mod = 1_000_000_007;
        
        // int[][] dp 초기화
        int[][] dp = new int[row+1][col+1];
        
        // puddles 추가
        for (int[] obs: puddles) {
            dp[obs[1]][obs[0]] = -1;
        }
        
        // dp 완성하기
        dp[1][1] = 1;
        for (int i=1; i<=row; i++) {
            for (int j=1; j<=col; j++) {
                if (dp[i][j]!=-1) {
                    if (dp[i][j-1]>0) dp[i][j] += dp[i][j-1]%mod;
                    if (dp[i-1][j]>0) dp[i][j] += dp[i-1][j]%mod;
                    dp[i][j]%=mod;
                }
            }
        }
        
        // 정답
        return dp[row][col];
    }
}
