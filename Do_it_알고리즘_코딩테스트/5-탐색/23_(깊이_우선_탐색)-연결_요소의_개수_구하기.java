import java.util.*;
import java.io.*;

public class Main {
    static int node, edge, count;
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visit;

    static void dfs(int x) {
        visit[x] = true;

        for (int num: adj.get(x)) {
            if (!visit[num]) dfs(num);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());
        visit = new boolean[node+1];
        adj = new ArrayList<>(node+1);
        for (int i=0; i<node+1; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i=0; i<edge; i++) {
            st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());

            adj.get(one).add(two);
            adj.get(two).add(one);
        }

        count = 0;
        for (int number=1; number<node+1; number++) {
            if (!visit[number]) {
                count++;
                dfs(number);
            }
        }

        System.out.println(count);

        br.close();
    }
}
