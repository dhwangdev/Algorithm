import java.util.*;
import java.io.*;

public class Main {
    static int h, w;
    static int[][] mat;
    static boolean[][] visit;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int count, area;

    static void bfs(int y, int x) {
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offerLast(new int[] {y, x});
        visit[y][x] = true;
        int tempArea = 0;

        while (!queue.isEmpty()) {
            int[] temp = queue.pollFirst();
            tempArea++;

            for (int dir=0; dir<4; dir++) {
                int nextY = temp[0] + dy[dir];
                int nextX = temp[1] + dx[dir];

                if (nextY<0 || nextX<0 || nextY>=h || nextX>=w) continue;
                if (mat[nextY][nextX]==0 || visit[nextY][nextX]) continue;

                queue.offerLast(new int[] {nextY, nextX});
                visit[nextY][nextX] = true;
            }
        }

        area = Math.max(area, tempArea);
        count++;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());

        mat = new int[h][w];
        visit = new boolean[h][w];
        for (int row=0; row<h; row++) {
            st = new StringTokenizer(br.readLine());
            for (int col=0; col<w; col++) {
                mat[row][col] = Integer.parseInt(st.nextToken());
            }
        }

        for (int row=0; row<h; row++) {
            for (int col=0; col<w; col++) {
                if (mat[row][col]==1 && !visit[row][col]) bfs(row, col);
            }
        }

        System.out.println(count);
        System.out.println(area);

        br.close();
    }
}
