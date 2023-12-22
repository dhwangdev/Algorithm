import java.util.*;
import java.io.*;

public class Main {
    static int node, edge, count;
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visit;

    static class Point {
        int value;
        int depth;

        public Point(int value, int depth) {
            this.value = value;
            this.depth = depth;
        }
    }

    static void bfs() {
        Queue<Point> queue = new ArrayDeque<>();
        queue.offer(new Point(1, 1));
        visit[1] = true;

        while (!queue.isEmpty()) {
            Point temp = queue.poll();

            if (temp.depth==3) return;

            for (int num: adj.get(temp.value)) {
                if (!visit[num]) {
                    queue.offer(new Point(num, temp.depth+1));
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
        visit = new boolean[node+1];
        for (int i=0; i<node+1; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i=0; i<edge; i++) {
            st = new StringTokenizer(br.readLine());
            int fir = Integer.parseInt(st.nextToken());
            int sec = Integer.parseInt(st.nextToken());

            adj.get(fir).add(sec);
            adj.get(sec).add(fir);
        }

        bfs();

        System.out.println(count);

        br.close();
    }
}
