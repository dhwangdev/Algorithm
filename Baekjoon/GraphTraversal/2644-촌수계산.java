import java.util.*;
import java.io.*;

public class Main {
    static int node, start, end, edge, dis;
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visit;

    static void dfs(int root, int depth) {
        if (root==end) {
            dis = depth;
            return;
        }

        visit[root] = true;
        for (int num: adj.get(root)) {
            if (!visit[num]) dfs(num, depth+1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        node = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(br.readLine());
        adj = new ArrayList<>(node+1);
        for (int i=0; i<node+1; i++) {
            adj.add(new ArrayList<>());
        }
        visit = new boolean[node+1];
        for (int i=0; i<edge; i++) {
            st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());

            adj.get(one).add(two);
            adj.get(two).add(one);
        }

        dis = -1;

        dfs(start, 0);

        System.out.println(dis);

        br.close();
    }
}
