import java.util.*;
import java.io.*;

public class Main {
    static int start, end, ans;

    static class Point {
        long value;
        int depth;

        public Point(long value, int depth) {
            this.value = value;
            this.depth = depth;
        }
    }

    static void bfs(int x) {
        Queue<Point> queue = new ArrayDeque<>();
        queue.offer(new Point(x, 1));

        while (!queue.isEmpty()) {
            Point temp = queue.poll();

            long mulTwo = temp.value * 2;
            if (mulTwo==end) {
                ans = temp.depth+1;
                return;
            }
            long placeOne = temp.value * 10 + 1;
            if (placeOne==end) {
                ans = temp.depth+1;
                return;
            }

            if (mulTwo <= end) queue.offer(new Point(mulTwo, temp.depth+1));
            if (placeOne <= end) queue.offer(new Point(placeOne, temp.depth+1));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        ans = -1;
        bfs(start);

        System.out.println(ans);

        br.close();
    }
}
