import java.util.*;
import java.io.*;

public class Main {
    static int y, x;
    static char[][] mat;
    static boolean[][] visit;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    static void bfs(int row, int col) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {row, col});
        visit[row][col] = true;

        while (!queue.isEmpty()) {
            int[] temp = queue.poll();

            for (int i=0; i<4; i++) {
                int nextY = temp[0] + dy[i];
                int nextX = temp[1] + dx[i];

                if (nextY<0 || nextX<0 || nextY>=y || nextX>=x) continue;
                if (mat[nextY][nextX]=='.' || visit[nextY][nextX]) continue;

                queue.offer(new int[] {nextY, nextX});
                visit[nextY][nextX] = true;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());
        for (int t=0; t<tc; t++) {
            st = new StringTokenizer(br.readLine());
            y = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());

            mat = new char[y][x];
            visit = new boolean[y][x];
            for (int i=0; i<y; i++) {
                mat[i] = br.readLine().toCharArray();
            }

            int count = 0;

            for (int i=0; i<y; i++) {
                for (int j=0; j<x; j++) {
                    if (mat[i][j]=='#' && !visit[i][j]) {
                        bfs(i, j);
                        count++;
                    }
                }
            }

            sb.append(count+"\n");
        }

        System.out.println(sb);
        
        br.close();
    }
}
