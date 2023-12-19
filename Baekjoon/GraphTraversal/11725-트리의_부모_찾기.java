import java.util.*;
import java.io.*;

public class Main {
    static int qnt;
    static ArrayList<ArrayList<Integer>> adj;
    static int[] ans;
    static boolean[] visit;

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

        qnt = Integer.parseInt(br.readLine());
        ans = new int[qnt+1];
        visit = new boolean[qnt+1];
        adj = new ArrayList<>(qnt+1);
        for (int i=0; i<qnt+1; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i=0; i<qnt-1; i++) {
            st = new StringTokenizer(br.readLine());
            int fir = Integer.parseInt(st.nextToken());
            int sec = Integer.parseInt(st.nextToken());

            adj.get(fir).add(sec);
            adj.get(sec).add(fir);
        }

        dfs(1);

        for (int i=2; i<qnt+1; i++) {
            sb.append(ans[i]+"\n");
        }

        System.out.println(sb);

        br.close();
    }
}
