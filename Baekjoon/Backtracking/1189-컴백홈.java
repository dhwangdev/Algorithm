import java.util.*;
import java.io.*;

public class Main {
    static int h, w, target, count;
    static char[][] mat;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static boolean[][] visit;

    static void dfs(int y, int x, int curr) {
        if (y==0 && x==w-1) {
            if (curr==target) count++;
            return;
        }

        visit[y][x] = true;
        for (int ite=0; ite<4; ite++) {

            if (y+dy[ite]<0 || x+dx[ite]<0 || y+dy[ite]==h || x+dx[ite]==w) continue;
            if (mat[y+dy[ite]][x+dx[ite]]=='T' || visit[y+dy[ite]][x+dx[ite]]) continue;

            dfs(y+dy[ite], x+dx[ite], curr+1);
        }
        visit[y][x] = false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        target = Integer.parseInt(st.nextToken());
        mat = new char[h][w];
        for (int i=0; i<h; i++) {
            String temp = br.readLine();
            for (int j=0; j<w; j++) {
                mat[i][j] = temp.charAt(j);
            }
        }
        visit = new boolean[h][w];

         dfs(h-1, 0, 1);

        System.out.println(count);

        br.close();
    }
}
