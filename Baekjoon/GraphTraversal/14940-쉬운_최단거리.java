import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[][] mat = new int[y][x];
        boolean[][] visit = new boolean[y][x];
        int rootY = 0;
        int rootX = 0;
        int[] dy = {-1, 0, 1, 0};
        int[] dx = {0, 1, 0, -1};

        for (int i=0; i<y; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<x; j++) {
                mat[i][j] = Integer.parseInt(st.nextToken());
                if (mat[i][j]==1) mat[i][j] = -1;
                else {
                    if (mat[i][j]==2) {
                        rootY = i;
                        rootX = j;
                    }
                    mat[i][j] = 0;
                }
            }
        }

        Deque<int[]> queue = new ArrayDeque<>();
        queue.offerLast(new int[] {rootY, rootX});
        visit[rootY][rootX] = true;

        while (!queue.isEmpty()) {
            int[] temp = queue.pollFirst();
            int nowY = temp[0];
            int nowX = temp[1];

            for (int i=0; i<4; i++) {
                int nextY = nowY + dy[i];
                int nextX = nowX + dx[i];

                if (nextY<0 || nextX<0 || nextY>=y || nextX>=x) continue;
                if (mat[nextY][nextX]==0 || visit[nextY][nextX]) continue;
                queue.offerLast(new int[] {nextY, nextX});
                visit[nextY][nextX] = true;
                mat[nextY][nextX] = mat[nowY][nowX]+1;
            }
        }

        for (int i=0; i<y; i++) {
            for (int j=0; j<x; j++) {
                sb.append(mat[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
