import java.util.*;
import java.io.*;

public class Main {
    static int y, x, dis;
    static char[][] mat;
    static boolean[][] visit;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    static void bfs(int row, int col, int currDis) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {row, col, currDis});
        visit[row][col] = true;

        while (!queue.isEmpty()) {
            int[] temp = queue.poll();

            for (int i=0; i<4; i++) {
                int nextY = temp[0] + dy[i];
                int nextX = temp[1] + dx[i];

                if (nextY<0 || nextY==y || nextX<0 || nextX==x) continue;
                if (mat[nextY][nextX]=='W' || visit[nextY][nextX]) continue;

                queue.offer(new int[] {nextY, nextX, temp[2]+1});
                visit[nextY][nextX] = true;
            }

            dis = Math.max(dis, temp[2]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        y = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        mat = new char[y][x];
        for (int i=0; i<y; i++) {
            String line = br.readLine();
            for (int j=0; j<x; j++) {
                mat[i][j] = line.charAt(j);
            }
        }

        for (int i=0; i<y; i++) {
            for (int j=0; j<x; j++) {
                if (mat[i][j]=='L') {
                    visit = new boolean[y][x];
                    bfs(i, j, 0);
                }
            }
        }

        System.out.println(dis);

        br.close();
    }
}
