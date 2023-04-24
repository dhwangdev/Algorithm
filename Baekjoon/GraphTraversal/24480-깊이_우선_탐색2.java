import java.util.*;
import java.io.*;

public class Main {
    static int node, edge, root, order;
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visit;
    static int[] arrAns;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int a) {
        visit[a] = true;
        arrAns[a] = ++order;

        for (int idx=0; idx<adj.get(a).size(); idx++) {
            int num = adj.get(a).get(idx);

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
        for (int i=0; i<node+1; i++) {
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

        for (int i=1; i<node+1; i++) {
            Collections.sort(adj.get(i), Collections.reverseOrder());
        }

        dfs(root);
        for (int i=1; i<node+1; i++) {
            sb.append(arrAns[i]+"\n");
        }

        System.out.println(sb);

        br.close();
    }
}
