import java.util.*;
import java.io.*;

public class Main {
    static int y, x, count;
    static int[][] mat;
    static boolean[][] visit;
    static int[] dy = {-1, 0, 1, 0, -1, 1, 1, -1};
    static int[] dx = {0, 1, 0, -1, 1, 1, -1, -1};

    static void bfs(int row, int col) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {row, col});
        visit[row][col] = true;

        while (!queue.isEmpty()) {
            int[] temp = queue.poll();

            for (int i=0; i<8; i++) {
                int nextY = temp[0] + dy[i];
                int nextX = temp[1] + dx[i];

                if (nextY<0 || nextY==y || nextX<0 || nextX==x) continue;
                if (visit[nextY][nextX] || mat[nextY][nextX]==0) continue;

                queue.offer(new int[] {nextY, nextX});
                visit[nextY][nextX] = true;
            }
        }

        count++;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        y = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        mat = new int[y][x];
        for (int i=0; i<y; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<x; j++) {
                mat[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visit = new boolean[y][x];

        for (int i=0; i<y; i++) {
            for (int j=0; j<x; j++) {
                if (!visit[i][j] && mat[i][j]==1) {
                    bfs(i, j);
                }
            }
        }

        System.out.println(count);

        br.close();
    }
}
