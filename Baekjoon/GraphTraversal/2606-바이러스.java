import java.util.*;
import java.io.*;

public class Main {
    static int node, edge, count;
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visit;

    static void bfs() {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offerLast(1);
        visit[1] = true;

        while (!queue.isEmpty()) {
            int temp = queue.pollFirst();

            for (int idx=0; idx<adj.get(temp).size(); idx++) {
                int num = adj.get(temp).get(idx);

                if (!visit[num]) {
                    queue.offerLast(num);
                    visit[num] = true;
                    count++;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        node = Integer.parseInt(br.readLine());
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

        bfs();
        System.out.println(count);

        br.close();
    }
}
