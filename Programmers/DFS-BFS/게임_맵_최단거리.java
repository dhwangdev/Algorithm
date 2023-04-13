import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int y = maps.length;
        int x = maps[0].length;
        boolean[][] visit = new boolean [y][x];
        int[] dy = {-1, 0, 1, 0};
        int[] dx = {0, 1, 0, -1};
        
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offerLast(new int[] {0, 0});
        visit[0][0] = true;
        
        while (!queue.isEmpty()) {
            int[] temp = queue.pollFirst();
            int nowY = temp[0];
            int nowX = temp[1];
            
            for (int i=0; i<4; i++) {
                int nextY = nowY + dy[i];
                int nextX = nowX + dx[i];
                
                if (nextY<0 || nextX <0 || nextY>=y || nextX>=x) continue;
                if (visit[nextY][nextX] || maps[nextY][nextX]==0) continue;
                
                queue.offerLast(new int[] {nextY, nextX});
                visit[nextY][nextX] = true;
                maps[nextY][nextX] = maps[nowY][nowX]+1;
            }
        }
        
        if (maps[y-1][x-1]<=1) return -1;
        return maps[y-1][x-1];
    }
}
