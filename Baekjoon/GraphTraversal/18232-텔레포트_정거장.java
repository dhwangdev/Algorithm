import java.util.*;
import java.io.*;

public class Main {
    static int node, edge, start, end, ans;
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visit;

    static class Point {
        int pos;
        int dis;

        public Point(int pos, int dis) {
            this.pos = pos;
            this.dis = dis;
        }
    }

    static void bfs(int x) {
        Queue<Point> queue = new ArrayDeque<>();
        queue.offer(new Point(x, 0));
        visit[x] = true;

        while (!queue.isEmpty()) {
            Point temp = queue.poll();

            for (int num: adj.get(temp.pos)) {
                if (num==end) {
                    ans = temp.dis+1;
                    return;
                }

                if (!visit[num]) {
                    queue.offer(new Point(num, temp.dis+1));
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
        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        visit = new boolean[node+1];
        adj = new ArrayList<>(node+1);
        for (int i=0; i<node+1; i++) {
            adj.add(new ArrayList<>());

            if (i>=2) {
                adj.get(i-1).add(i);
                adj.get(i).add(i-1);
            }
        }

        for (int i=0; i<edge; i++) {
            st = new StringTokenizer(br.readLine());
            int fir = Integer.parseInt(st.nextToken());
            int sec = Integer.parseInt(st.nextToken());

            adj.get(fir).add(sec);
            adj.get(sec).add(fir);
        }

        bfs(start);

        System.out.println(ans);

        br.close();
    }
}
