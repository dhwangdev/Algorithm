import java.util.*;

class Solution {
    static String[] vowelArr = {"A", "E", "I", "O", "U"};
    static int ans, count;
    static boolean done = false;
    
    static void dfs(int depth, String curr, String std) {
        if (done) return;
        
        count++;
        if (curr.equals(std)) {
            ans = count;
            done = true;
        }
        
        if (depth==5) {
            return;
        }
        
        for (int idx=0; idx<5; idx++) {
            dfs(depth+1, curr+vowelArr[idx], std);
        }
    }
    
    public int solution(String word) {
        for (int i=0; i<5; i++) {
            dfs(1, vowelArr[i], word);
        }
        
        return ans;
    }
}
