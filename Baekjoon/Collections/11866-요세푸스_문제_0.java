import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i=1; i<=N; i++) {
            queue.offerLast(i);
        }

        int count = 0;
        sb.append("<");

        while (queue.size()>1) {
            count++;
            if (count!=K) {
                queue.offerLast(queue.pollFirst());
            }
            else {
                sb.append(queue.pollFirst()).append(", ");
                count = 0;
            }
        }

        sb.append(queue.peekFirst()).append(">");

        System.out.println(sb.toString());

        br.close();
    }
}
