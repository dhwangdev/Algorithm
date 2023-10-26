import java.util.*;
import java.io.*;

public class Main {
    static int y, x;
    static int[][] mat;
    static boolean[][] visit;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    static void bfs(int row, int col) {
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offerLast(new int[] {row, col});
        visit[row][col] = true;

        while (!queue.isEmpty()) {
            int[] temp = queue.pollFirst();
            int nowY = temp[0];
            int nowX = temp[1];

            for (int i=0; i<4; i++) {
                int nextY = nowY + dy[i];
                int nextX = nowX + dx[i];

                if (nextY<0 || nextX<0 || nextY>=y || nextX>=x) continue;
                if (visit[nextY][nextX] || mat[nextY][nextX]==0) continue;

                queue.offerLast(new int[] {nextY, nextX});
                visit[nextY][nextX] = true;
                mat[nextY][nextX] = mat[nowY][nowX] + 1;
            }
        }
    } // bfs

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        y = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        mat = new int[y][x];
        visit = new boolean[y][x];

        for (int i=0; i<y; i++) {
            String line = br.readLine();
            for (int j=0; j<x; j++) {
                mat[i][j] = Character.getNumericValue(line.charAt(j));
            }
        }

        bfs(0, 0);
        System.out.println(mat[y-1][x-1]);

        br.close();
    }
}
