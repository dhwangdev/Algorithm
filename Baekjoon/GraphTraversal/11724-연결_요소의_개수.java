import java.util.*;
import java.io.*;

public class Main {
    static int node, edge, count;
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visit;

    static void bfs(int root) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offerLast(root);
        visit[root] = true;

        while (!queue.isEmpty()) {
            int temp = queue.pollFirst();

            for (int num: adj.get(temp)) {
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

        count = 0;

        for (int no=1; no<=node; no++) {
            if (!visit[no]) {
                count++;
                bfs(no);
            }
        }

        System.out.println(count);

        br.close();
    }
}
