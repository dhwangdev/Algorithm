import java.util.*;
import java.io.*;

public class Main {
    static int y, x, max;
    static int[][] mat;
    static boolean[][] visit;
    static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};

    static void bfs(int row, int col) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {row, col, 1});
        visit[row][col] = true;

        while (!queue.isEmpty()) {
            int[] temp = queue.poll();

            for (int i=0; i<8; i++) {
                int nextY = temp[0] + dy[i];
                int nextX = temp[1] + dx[i];

                if (nextY<0 || nextX<0 || nextY>=y || nextX>=x) continue;
                if (visit[nextY][nextX]) continue;

                if (mat[nextY][nextX]!=1) {
                    queue.offer(new int[] {nextY, nextX, temp[2]+1});
                    visit[nextY][nextX] = true;
                }
                else {
                    max = Math.max(max, temp[2]);
                    return;
                }
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
        for (int i=0; i<y; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<x; j++) {
                mat[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0; i<y; i++) {
            for (int j=0; j<x; j++) {
                if (mat[i][j]==0) {
                    visit = new boolean[y][x];
                    bfs(i, j);
                }
            }
        }

        System.out.println(max);

        br.close();
    }
}
