import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int ans = 0;
        
        Arrays.sort(d);
        
        for (int idx = 0; idx < d.length; idx += 1) {
            budget -= d[idx];
            
            if (budget < 0) {
                break;
            }
            ans += 1;
        }
        return ans;
    }
}
