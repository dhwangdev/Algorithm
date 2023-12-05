import java.util.*;
import java.io.*;

public class Main {
    static int y, x;
    static char[][] mat;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static boolean[][] visit;

    static void bfs(int row, int col) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {row, col});
        visit[row][col] = true;

        while (!queue.isEmpty()) {
            int[] temp = queue.poll();

            for (int i=0; i<4; i++) {
                int nextY = temp[0]+dy[i];
                int nextX = temp[1]+dx[i];

                if (nextY<0 || nextX<0 || nextY==y || nextX==x) continue;
                if (visit[nextY][nextX] || mat[nextY][nextX]=='1') continue;
                queue.offer(new int[] {nextY, nextX});
                mat[nextY][nextX] = '2';
                visit[nextY][nextX] = true;
            }
        }

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
            String temp = br.readLine();
            for (int j=0; j<x; j++) {
                mat[i][j] = temp.charAt(j);

                if (i==0 && mat[i][j]=='0') mat[i][j] = '2';
            }
        }

        for (int j=0; j<x; j++) {
            if (mat[0][j]=='2') bfs(0, j);
        }

        boolean possible = false;

        for (int j=0; j<x; j++) {
            if (mat[y-1][j]=='2') {
                possible = true;
                break;
            }
        }

        if (possible) System.out.println("YES");
        else System.out.println("NO");

        br.close();
    }
}
