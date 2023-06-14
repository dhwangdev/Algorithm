import java.util.*;
import java.io.*;

public class Main {
    static int T, max;
    static int[][] mat;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int depth, int sum) {
        if (depth==11) {
            max = Math.max(max, sum);
            return;
        }

        for (int idx=0; idx<11; idx++) {
            if (!visit[idx] && mat[depth][idx]!=0) {
                visit[idx] = true;
                dfs(depth+1, sum+mat[depth][idx]);
                visit[idx] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc=0; tc<T; tc++) {
            mat = new int[11][11];
            max = -1;
            visit = new boolean[11];

            for (int i=0; i<11; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j=0; j<11; j++) {
                    mat[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            dfs(0, 0);
            sb.append(max).append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
