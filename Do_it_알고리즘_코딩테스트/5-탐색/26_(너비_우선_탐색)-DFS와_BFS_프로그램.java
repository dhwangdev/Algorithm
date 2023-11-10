import java.util.*;
import java.io.*;

public class Main {
    static int node, edge, root;
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int x) {
        visit[x] = true;
        sb.append(x + " ");

        for (int num: adj.get(x)) {
            if (!visit[num]) {
                dfs(num);
            }
        }
    }

    static void bfs(int x) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offerLast(x);
        visit[x] = true;

        while (!queue.isEmpty()) {
            int temp = queue.pollFirst();
            sb.append(temp + " ");

            for (int num: adj.get(temp)) {
                if (!visit[num]) {
                    visit[num] = true;
                    queue.offerLast(num);
                }
            }
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
        for (int i=0; i<edge; i++) {
            st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());

            adj.get(one).add(two);
            adj.get(two).add(one);
        }

        for (ArrayList<Integer> list: adj) {
            Collections.sort(list);
        }

        dfs(root);
        sb.append("\n");
        visit = new boolean[node+1];

        bfs(root);

        System.out.println(sb);

        br.close();
    }
}
