import java.util.*;
import java.io.*;

public class Main {
    static int x, y, ally, foe;
    static char[][] mat;
    static boolean[][] visit;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    static void bfs(int row, int col) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {row, col});
        visit[row][col] = true;
        int tempCount = 1;

        while (!queue.isEmpty()) {
            int[] temp = queue.poll();

            for (int i=0; i<4; i++) {
                int nextY = temp[0] + dy[i];
                int nextX = temp[1] + dx[i];

                if (nextY<0 || nextX<0 || nextY==y || nextX==x) continue;
                if (visit[nextY][nextX]) continue;

                if (mat[nextY][nextX]==mat[row][col]) {
                    queue.offer(new int[] {nextY, nextX});
                    visit[nextY][nextX] = true;
                    tempCount++;
                }
            }
        }

        if (mat[row][col]=='W') ally += tempCount * tempCount;
        else foe += tempCount * tempCount;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        mat = new char[y][x];
        visit = new boolean[y][x];
        for (int i=0; i<y; i++) {
            mat[i] = br.readLine().toCharArray();
        }

        for (int i=0; i<y; i++) {
            for (int j=0; j<x; j++) {
                if (!visit[i][j]) {
                    bfs(i, j);
                }
            }
        }

        System.out.println(ally + " " + foe);

        br.close();
    }
}
