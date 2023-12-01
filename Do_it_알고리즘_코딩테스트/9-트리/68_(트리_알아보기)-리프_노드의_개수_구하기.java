import java.util.*;
import java.io.*;

public class Main {
    static int node, root, del, count;
    static ArrayList<ArrayList<Integer>> adj;

    static void dfs(int x) {
        boolean isLeaf = true;

        for (int num: adj.get(x)) {
            if (num!=del) {
                isLeaf = false;
                dfs(num);
            }
        }

        if (isLeaf) count++;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        node = Integer.parseInt(br.readLine());
        adj = new ArrayList<>(node);
        for (int i=0; i<node; i++) {
            adj.add(new ArrayList<>());
        }

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<node; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num!=-1) adj.get(num).add(i);
            else root = i;
        }
        del = Integer.parseInt(br.readLine());

        if (root!=del) {
            dfs(root);
            System.out.println(count);
        }
        else System.out.println(0);

        br.close();
    }
}
