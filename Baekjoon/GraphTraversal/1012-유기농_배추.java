import java.util.*;
import java.io.*;

public class Main {
    static int tc, x, y, cabQnt, count;
    static int[][] mat;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static boolean[][] visit;
    static StringBuilder sb = new StringBuilder();

    static void bfs(int rootY, int rootX) {
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offerLast(new int[] {rootY, rootX});
        visit[rootY][rootX] = true;

        while (!queue.isEmpty()) {
            int[] temp = queue.pollFirst();

            for (int idx=0; idx<4; idx++) {
                int newY = temp[0]+dy[idx];
                int newX = temp[1]+dx[idx];

                if (newY<0 || newY==y || newX<0 || newX==x) continue;
                if (mat[newY][newX]==0 || visit[newY][newX]) continue;

                queue.offerLast(new int[] {newY, newX});
                visit[newY][newX] = true;

            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        tc = Integer.parseInt(br.readLine());
        for (int T=0; T<tc; T++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            cabQnt = Integer.parseInt(st.nextToken());
            mat = new int[y][x];
            visit = new boolean[y][x];
            for (int i=0; i<cabQnt; i++) {
                st = new StringTokenizer(br.readLine());
                int tempX = Integer.parseInt(st.nextToken());
                int tempY = Integer.parseInt(st.nextToken());

                mat[tempY][tempX] = 1;
            }
            count = 0;

            for (int i=0; i<y; i++) {
                for (int j=0; j<x; j++) {
                    if (!visit[i][j] && mat[i][j]==1) {
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
