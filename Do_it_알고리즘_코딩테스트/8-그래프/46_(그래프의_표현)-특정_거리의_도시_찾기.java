import java.util.*;
import java.io.*;

public class Main {
    static int node, edge, dis, root;
    static ArrayList<ArrayList<Integer>> adj;
    static int[] visit;
    static ArrayList<Integer> ans;
    static StringBuilder sb = new StringBuilder();

    static void bfs(int start) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offerLast(start);
        visit[start] = 0;

        while (!queue.isEmpty()) {
            int temp = queue.pollFirst();

            for (int num: adj.get(temp)) {
                if (visit[num]==-1) {
                    queue.offerLast(num);
                    visit[num] = visit[temp]+1;
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
        dis = Integer.parseInt(st.nextToken());
        root = Integer.parseInt(st.nextToken());
        adj = new ArrayList<>(node+1);
        for (int i=0; i<node+1; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i=0; i<edge; i++) {
            st = new StringTokenizer(br.readLine());

            int fir = Integer.parseInt(st.nextToken());
            int sec = Integer.parseInt(st.nextToken());

            adj.get(fir).add(sec);
        }

        visit = new int[node+1];
        Arrays.fill(visit, -1);

        bfs(root);

        ans = new ArrayList<>();
        for (int i=0; i<node+1; i++) {
            if (visit[i]==dis) ans.add(i);
        }

        if (ans.isEmpty()) System.out.println(-1);
        else {
            Collections.sort(ans);
            for (int num: ans) sb.append(num+"\n");
        }

        System.out.println(sb);

        br.close();
    }
}
