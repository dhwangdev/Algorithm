import java.util.*;
import java.io.*;

public class Main {
    static int node;
    static int[] ans;
    static boolean[] visit;
    static ArrayList<ArrayList<Integer>> adj;

    static void dfs(int x) {
        visit[x] = true;

        for (int num: adj.get(x)) {
            if (!visit[num]) {
                ans[num] = x;
                dfs(num);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        node = Integer.parseInt(br.readLine());
        ans = new int[node+1];
        visit = new boolean[node+1];
        adj = new ArrayList<>(node+1);
        for (int i=0; i<node+1; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i=0; i<node-1; i++) {
            st = new StringTokenizer(br.readLine());
            int fir = Integer.parseInt(st.nextToken());
            int sec = Integer.parseInt(st.nextToken());

            adj.get(fir).add(sec);
            adj.get(sec).add(fir);
        }

         dfs(1);

        for (int idx=2; idx<node+1; idx++) {
            sb.append(ans[idx]+"\n");
        }

        System.out.println(sb);

        br.close();
    }
}
