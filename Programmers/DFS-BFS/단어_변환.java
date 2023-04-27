class Solution {
    static boolean[] visit;
    static int ans = 51;
    
    static void dfs(String line, String target, String[] words, int count) {
        if (line.equals(target)) {
            ans = (ans > count)? count : ans;
            return;
        }
        
        for (int i=0; i<words.length; i++) {
            if (!visit[i]) {
                
                int dif = 0;
                for (int j=0; j<target.length(); j++) {
                    if (line.charAt(j)!=words[i].charAt(j)) dif++;
                }
                
                if (dif==1) {
                    visit[i] = true;
                    dfs(words[i], target, words, count+1);
                    visit[i] = false;
                }
            }
        }
    }
    
    public int solution(String begin, String target, String[] words) {
        visit = new boolean[words.length];
        
        dfs(begin, target, words, 0);
        
        return (ans==51)? 0: ans;
        
    }
}
