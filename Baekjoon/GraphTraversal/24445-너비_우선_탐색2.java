import java.util.*;
import java.io.*;

public class Main {
    static int node, edge, root, order;
    static boolean[] visit;
    static ArrayList<ArrayList<Integer>> adj;
    static int[] arrAns;
    static StringBuilder sb = new StringBuilder();

    static void bfs() {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offerLast(root);
        visit[root] = true;

        while (!queue.isEmpty()) {
            int temp = queue.pollFirst();
            arrAns[temp] = ++order;

            for (int idx=0; idx<adj.get(temp).size(); idx++) {
                int num = adj.get(temp).get(idx);

                if (!visit[num]) {
                    queue.offerLast(num);
                    visit[num] = true;
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
            Collections.sort(adj.get(idx), Collections.reverseOrder());
        }

        bfs();
        for (int idx=1; idx<node+1; idx++) {
            sb.append(arrAns[idx]+"\n");
        }

        System.out.println(sb);

        br.close();
    }
}
