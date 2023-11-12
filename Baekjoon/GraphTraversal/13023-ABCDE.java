import java.util.*;
import java.io.*;

public class Main {
    static int node, edge;
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visit;
    static boolean exist;

    static void dfs(int x, int depth) {
        visit[x] = true;

        if (depth==5) {
            exist = true;
            return;
        }

        for (int no: adj.get(x)) {
            if (!visit[no]) dfs(no, depth+1);
        }

        visit[x] = false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());
        adj = new ArrayList<>(node);
        for (int i=0; i<node; i++) {
            adj.add(new ArrayList<>());
        }
        visit = new boolean[node];
        exist = false;

        for (int i=0; i<edge; i++) {
            st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());

            adj.get(one).add(two);
            adj.get(two).add(one);
        }

        for (int num=0; num<node; num++) {
            dfs(num, 1);
        }

        if (exist) System.out.println(1);
        else System.out.println(0);

        br.close();
    }
}
