import java.util.*;
import java.io.*;

public class Main {
    static int lim, count;
    static int[] roman = {1, 5, 10, 50};
    static boolean[] visit = new boolean[1001];

    static void dfs(int depth, int pos, int curr) {
        if (depth==lim) {
            if (!visit[curr]) {
                visit[curr] = true;
                count++;
            }
            return;
        }

        for (int idx=pos; idx<4; idx++) {
            dfs(depth+1, idx, curr+roman[idx]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        lim = Integer.parseInt(br.readLine());

        dfs(0, 0, 0);
        System.out.println(count);

        br.close();
    }
}
