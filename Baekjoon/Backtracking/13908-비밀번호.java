import java.util.*;
import java.io.*;

public class Main {
    static int lim, must, count;
    static boolean[] visit;

    static void dfs(int depth, int temp) {
        if (depth==lim) {
            if (temp==must) count++;
            return;
        }

        for (int num=0; num<=9; num++) {
            if (visit[num]) {
                visit[num] = false;
                dfs(depth+1, temp+1);
                visit[num] = true;
            }
            else dfs(depth+1, temp);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        lim = Integer.parseInt(st.nextToken());
        must = Integer.parseInt(st.nextToken());
        visit = new boolean[10];
        if (must!=0) {
            st = new StringTokenizer(br.readLine());
            for (int i=0; i<must; i++) {
                visit[Integer.parseInt(st.nextToken())] = true;
            }
        }

        dfs(0, 0);
        System.out.println(count);

        br.close();
    }
}
