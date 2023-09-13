import java.util.*;
import java.io.*;

public class Main {
    static boolean[][] visit;
    static int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
    static int h, w, count;
    static int[][] mat;

    static void bfs(int row, int col) {
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offerLast(new int[] {row, col});
        visit[row][col] = true;

        while (!queue.isEmpty()) {
            int[] temp = queue.pollFirst();

            for (int dir=0; dir<8; dir++) {
                int nextY = temp[0] + dy[dir];
                int nextX = temp[1] + dx[dir];

                if (nextY<0 || nextX<0 || nextY==h || nextX==w) continue;
                if (visit[nextY][nextX] || mat[nextY][nextX]==0) continue;

                queue.offerLast(new int[] {nextY, nextX});
                visit[nextY][nextX] = true;
            }
        }

        count++;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            count = 0;
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if (w==0 && h==0) break;
            mat = new int[h][w];
            for (int row=0; row<h; row++) {
                st = new StringTokenizer(br.readLine());
                for (int col=0; col<w; col++) {
                    mat[row][col] = Integer.parseInt(st.nextToken());
                }
            }

            visit = new boolean[h][w];

            for (int row=0; row<h; row++) {
                for (int col=0; col<w; col++) {
                    if (mat[row][col]==1 && !visit[row][col]) bfs(row, col);
                }
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
