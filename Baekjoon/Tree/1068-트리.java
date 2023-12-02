import java.util.*;
import java.io.*;

public class Main {
    static int node, root, del, count;
    static ArrayList<ArrayList<Integer>> adj;

    static void bfs(int x) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(x);

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            boolean isLeaf = true;

            for (int num: adj.get(temp)) {
                if (num!=del) {
                    queue.offer(num);
                    isLeaf = false;
                }
            }

            if (isLeaf) count++;
        }
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

            if (num!=-1) {
                adj.get(num).add(i);
            }
            else root = i;
        }
        del = Integer.parseInt(br.readLine());

        if (root!=del) {
            bfs(root);
            System.out.println(count);
        }
        else System.out.println(0);

        br.close();
    }
}
