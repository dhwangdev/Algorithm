import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int total = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] cmd = new int[total];
        for (int i=0; i<total; i++) {
            cmd[i] = Integer.parseInt(st.nextToken());
        }

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i=1; i<=total; i++) {
            switch (cmd[total-i]) {
                case 1:
                    deque.offerFirst(i);
                    break;
                case 2:
                    int temp = deque.pollFirst();
                    deque.offerFirst(i);
                    deque.offerFirst(temp);
                    break;
                case 3:
                    deque.offerLast(i);
                    break;
            }
        }

        for (int num: deque) {
            sb.append(num+" ");
        }

        System.out.println(sb.toString());

        br.close();
    }
}
