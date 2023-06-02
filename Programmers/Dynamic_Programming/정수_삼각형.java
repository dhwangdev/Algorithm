import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int[][] dp = new int[triangle.length][triangle.length];
        
        dp[0][0] = triangle[0][0];
        for (int row=1; row<triangle.length; row++) {
            // leftmost
            dp[row][0] = dp[row-1][0] + triangle[row][0];
            
            // rightmost
            dp[row][row] = dp[row-1][row-1] + triangle[row][row];
            
            // middle
            for (int col=1; col<=row-1; col++) {
                dp[row][col] = Math.max(dp[row-1][col-1], dp[row-1][col]) + triangle[row][col];
            }
        }
        
        int max = -1;
        for (int x=0; x<triangle.length; x++) {
            max = Math.max(max, dp[triangle.length-1][x]);
        }
        
        return max;
    }
}
