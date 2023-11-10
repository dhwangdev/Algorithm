import java.util.*;
import java.io.*;

public class Main {
    static int y, x;
    static int[][] mat;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static boolean[][] visit;

    static void bfs(int rootY, int rootX) {
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offerLast(new int[] {rootY, rootX});
        visit[rootY][rootX] = true;

        while (!queue.isEmpty()) {
            int[] temp = queue.pollFirst();

            for (int idx=0; idx<4; idx++) {
                int newY = temp[0]+dy[idx];
                int newX = temp[1]+dx[idx];

                if (newY<0 || newY==y || newX<0 || newX==x) continue;
                if (mat[newY][newX]==0 || visit[newY][newX]) continue;

                queue.offerLast(new int[] {newY, newX});
                visit[newY][newX] = true;
                mat[newY][newX] = mat[temp[0]][temp[1]]+1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        y = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        mat = new int[y][x];
        visit = new boolean[y][x];
        for (int i=0; i<y; i++) {
            String line = br.readLine();
            for (int j=0; j<x; j++) {
                mat[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }

        bfs(0, 0);

        System.out.println(mat[y-1][x-1]);

        br.close();
    }
}
