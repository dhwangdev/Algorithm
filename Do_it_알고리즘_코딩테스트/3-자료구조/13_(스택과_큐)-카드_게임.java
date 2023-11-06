import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i=1; i<=N; i++) {
            queue.offerLast(i);
        }

        while (queue.size() > 1) {
            queue.pollFirst();
            queue.offerLast(queue.pollFirst());
        }

        System.out.println(queue.peekFirst());

        br.close();
    }
}
