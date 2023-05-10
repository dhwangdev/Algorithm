import java.util.*;
import java.io.*;

public class Main {
    static int len, ans;
    static int[][] arr;
    static boolean[] visit;

    static void dfs(int depth, int pos) {
        if (depth==len/2) {

            int start = 0;
            int link = 0;

            for (int i=0; i<len-1; i++) {
                for (int j=i+1; j<len; j++) {
                    if (visit[i] && visit[j]) start += (arr[i][j] + arr[j][i]);
                    if (!visit[i] && !visit[j]) link += (arr[i][j] + arr[j][i]);
                }
            }

            ans = Math.min(ans, Math.abs(start-link));
            return;
        }

        for (int idx=pos; idx<len; idx++) {
            if (!visit[idx]) {
                visit[idx] = true;
                dfs(depth+1, idx+1);
                visit[idx] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        len = Integer.parseInt(br.readLine());
        arr = new int[len][len];
        for (int i=0; i<len; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<len; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        visit = new boolean[len];
        ans = Integer.MAX_VALUE;

        dfs(0, 0);
        System.out.println(ans);

        br.close();
    }
}
