import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int idx = 0;

        int[] ans = new int[prices.length];

        while (idx!=prices.length-1) {
            for (int i=idx+1; i<=prices.length-1; i++) {
                if (prices[idx] <= prices[i]) ans[idx]++;
                else {
                    ans[idx]++;
                    break;
                }
            }

            idx++;
        }

        return ans;
    }
}
