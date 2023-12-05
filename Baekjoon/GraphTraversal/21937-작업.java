import java.util.*;
import java.io.*;

public class Main {
    static int node, edge, start, count;
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visit;

    static void dfs(int x) {
        visit[x] = true;

        for (int num: adj.get(x)) {
            if (!visit[num]) {
                count++;
                dfs(num);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());
        adj = new ArrayList<>(node+1);
        for (int i=0; i<node+1; i++) {
            adj.add(new ArrayList<>());
        }
        visit = new boolean[node+1];
        for (int i=0; i<edge; i++) {
            st = new StringTokenizer(br.readLine());
            int fir = Integer.parseInt(st.nextToken());
            int sec = Integer.parseInt(st.nextToken());

            adj.get(sec).add(fir);
        }

        start = Integer.parseInt(br.readLine());

        dfs(start);

        System.out.println(count);

        br.close();
    }
}
