import java.io.*;
import java.util.*;

public class Main {
    static int node, edge, root;
    static int[][] mat;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int x) {
        visited[x] = true;
        sb.append(x).append(" ");

        for (int num=1; num<=node; num++) {
            if (mat[x][num]==1 && !visited[num]) {
                dfs(num);
            }
        }
    } // dfs

    static void bfs() {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offerLast(root);
        visited[root] = true;

        while (!queue.isEmpty()) {
            int temp = queue.pollFirst();
            sb.append(temp).append(" ");

            for (int num=1; num<=node; num++) {
                if (mat[temp][num]==1 && !visited[num]) {
                    queue.offerLast(num);
                    visited[num] = true;
                }
            }
        }
    } // bfs

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());
        root = Integer.parseInt(st.nextToken());
        mat = new int[node+1][node+1];
        visited = new boolean[node+1];

        for (int i=0; i<edge; i++) {
            st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());

            mat[one][two] = 1;
            mat[two][one] = 1;
        }

        dfs(root);
        sb.append("\n");
        visited = new boolean[node+1];
        bfs();
        System.out.println(sb);

        br.close();
    }
}
