import java.util.*;
import java.io.*;

public class Main {
    static int y, x, sheep, wolf;
    static char[][] mat;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static boolean[][] visit;

    static void bfs(int row, int col) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {row, col});
        visit[row][col] = true;
        int tempSheep = 0;
        int tempWolf = 0;

        while (!queue.isEmpty()) {
            int[] temp = queue.poll();

            if (mat[temp[0]][temp[1]]=='k') tempSheep++;
            else if (mat[temp[0]][temp[1]]=='v') tempWolf++;

            for (int i=0; i<4; i++) {
                int nextY = temp[0] + dy[i];
                int nextX = temp[1] + dx[i];

                if (nextY<0 || nextY>=y || nextX<0 || nextX>=x) continue;
                if (visit[nextY][nextX] || mat[nextY][nextX]=='#') continue;

                queue.offer(new int[] {nextY, nextX});
                visit[nextY][nextX] = true;
            }
        }

        if (tempSheep>tempWolf) sheep += tempSheep;
        else wolf += tempWolf;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        y = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        mat = new char[y][x];
        visit = new boolean[y][x];
        for (int i=0; i<y; i++) {
            mat[i] = br.readLine().toCharArray();
        }

        for (int i=0; i<y; i++) {
            for (int j=0; j<x; j++) {
                if (mat[i][j]!='#' && !visit[i][j]) {
                    bfs(i, j);
                }
            }
        }

        System.out.println(sheep + " " + wolf);

        br.close();
    }
}
