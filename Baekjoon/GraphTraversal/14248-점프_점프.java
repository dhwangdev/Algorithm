import java.util.*;
import java.io.*;

public class Main {
    static int qnt, root, count;
    static int[] arr;
    static boolean[] visit;

    static void bfs(int x) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(x);
        visit[x] = true;
        count++;

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            int left = temp - arr[temp];
            int right = temp + arr[temp];

            if (left>=1 && !visit[left]) {
                queue.offer(left);
                visit[left] = true;
                count++;
            }

            if (right<=qnt && !visit[right]) {
                queue.offer(right);
                visit[right] = true;
                count++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        qnt = Integer.parseInt(br.readLine());
        arr = new int[qnt+1];
        visit = new boolean[qnt+1];
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<qnt+1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        root = Integer.parseInt(br.readLine());

        bfs(root);

        System.out.println(count);
        
        br.close();
    }
}
