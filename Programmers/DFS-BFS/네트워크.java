class Solution {
    static boolean[] visit;
    static int count;
    
    static void dfs(int num, int n, int[][] computers) {
        visit[num] = true;
        
        for (int j=0; j<n; j++) {
            if (computers[num][j]==1 && !visit[j]) {
                dfs(j, n, computers);
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        visit = new boolean[n];
        
        for (int i=0; i<n; i++) {
            if (!visit[i]) {
                dfs(i, n, computers);
                count++;
            }
        }
        
        return count;
    }
}
