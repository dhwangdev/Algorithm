import java.util.*;
import java.io.*;

public class Main {
    static int y, x, max;
    static char[][] mat;
    static boolean[] visit;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    static void dfs(int row, int col, int dis) {
        for (int i=0; i<4; i++) {
            int nextY = row + dy[i];
            int nextX = col + dx[i];

            if (nextY<0 || nextY>=y || nextX<0 || nextX>=x) continue;

            if (visit[mat[nextY][nextX]-'A']) {
                max = Math.max(max, dis);
            }
            else {
                visit[mat[nextY][nextX]-'A'] = true;
                dfs(nextY, nextX, dis+1);
                visit[mat[nextY][nextX]-'A'] = false;
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
        visit = new boolean[26];
        for (int i=0; i<y; i++) {
            mat[i] = br.readLine().toCharArray();
        }

        visit[mat[0][0]-'A'] = true;
        dfs(0, 0, 1);

        System.out.println(max);

        br.close();
    }
}
