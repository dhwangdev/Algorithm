import java.util.*;
import java.io.*;

public class Main {
    static int node, edge, root, order;
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visit;
    static int[] arrAns;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int x) {
        visit[x] = true;
        arrAns[x] = ++order;

        for (int idx=0; idx<adj.get(x).size(); idx++) {
            int num = adj.get(x).get(idx);
            if (!visit[num]) dfs(num);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());
        root = Integer.parseInt(st.nextToken());
        adj = new ArrayList<>(node+1);
        for (int idx=0; idx<node+1; idx++) {
            adj.add(new ArrayList<>());
        }
        visit = new boolean[node+1];
        arrAns = new int[node+1];

        for (int i=0; i<edge; i++) {
            st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());

            adj.get(one).add(two);
            adj.get(two).add(one);
        }

        for (int idx=1; idx<node+1; idx++) {
            Collections.sort(adj.get(idx));
        }

        dfs(root);
        for (int idx=1; idx<node+1; idx++) {
            sb.append(arrAns[idx]+"\n");
        }
        System.out.println(sb);

        br.close();
    }
}
