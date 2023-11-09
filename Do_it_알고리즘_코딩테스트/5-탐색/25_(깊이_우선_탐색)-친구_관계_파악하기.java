import java.util.*;
import java.io.*;

public class Main {
    static int node, edge;
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visit;
    static boolean can;

    static void dfs(int x, int depth) {
        visit[x] = true;

        if (depth==5) {
            can = true;
            return;
        }

        for (int num: adj.get(x)) {
            if (!visit[num]) dfs(num, depth+1);
        }

        visit[x] = false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        can = false;
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

        for (int number=0; number<=node-1; number++) {
            dfs(number, 1);
        }

        if (can) System.out.println(1);
        else System.out.println(0);

        br.close();
    }
}
