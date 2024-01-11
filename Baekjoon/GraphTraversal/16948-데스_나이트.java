import java.util.*;
import java.io.*;

public class Main {
    static int side;
    static int[][] mat;
    static boolean[][] visit;
    static int[] dy = {-2, -2, 0, 0, 2, 2};
    static int[] dx = {-1, 1, -2, 2, -1, 1};

    static void bfs(int row, int col) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {row, col});
        visit[row][col] = true;

        while (!queue.isEmpty()) {
            int[] temp = queue.poll();

            for (int i=0; i<6; i++) {
                int nextY = temp[0] + dy[i];
                int nextX = temp[1] + dx[i];

                if (nextY<0 || nextX<0 || nextY>=side || nextX>=side) continue;
                if (visit[nextY][nextX]) continue;

                queue.offer(new int[] {nextY, nextX});
                visit[nextY][nextX] = true;
                mat[nextY][nextX] = mat[temp[0]][temp[1]] + 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        side = Integer.parseInt(br.readLine());
        mat = new int[side][side];
        visit = new boolean[side][side];

        st = new StringTokenizer(br.readLine());
        int r1 = Integer.parseInt(st.nextToken());
        int c1 = Integer.parseInt(st.nextToken());
        int r2 = Integer.parseInt(st.nextToken());
        int c2 = Integer.parseInt(st.nextToken());

        bfs(r1, c1);

        if (!visit[r2][c2]) System.out.println(-1);
        else System.out.println(mat[r2][c2]);

        br.close();
    }
}
