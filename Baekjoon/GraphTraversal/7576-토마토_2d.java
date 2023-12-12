import java.util.*;
import java.io.*;

public class Main {
    static int x, y, day;
    static int[][] mat;
    static Queue<int[]> queue = new ArrayDeque<>();
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    static void bfs() {
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();

            for (int i=0; i<4; i++) {
                int nextY = temp[0] + dy[i];
                int nextX = temp[1] + dx[i];

                if (nextY<0 || nextY==y || nextX<0 || nextX==x) continue;
                if (mat[nextY][nextX]!=0) continue;
                mat[nextY][nextX] = 1;
                queue.offer(new int[] {nextY, nextX, temp[2]+1});
            }

            day = temp[2];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        mat = new int[y][x];
        for (int i=0; i<y; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<x; j++) {
                mat[i][j] = Integer.parseInt(st.nextToken());
                if (mat[i][j]==1) queue.offer(new int[] {i, j, 0});
            }
        }

        bfs();

        // 토마토 모두 익었는지 확인
        boolean done = true;
        outer:
        for (int i=0; i<y; i++) {
            for (int j=0; j<x; j++) {
                if (mat[i][j]==0) {
                    done = false;
                    break outer;
                }
            }
        }

        if (!done) System.out.println(-1);
        else System.out.println(day);

        br.close();
    }
}
