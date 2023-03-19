import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        outer:
        for (int tc=0; tc<T; tc++) {
            String line = br.readLine();
            int len = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), "[],");

            Deque<Integer> deque = new ArrayDeque<>();
            while (st.hasMoreTokens()) {
                deque.offerLast(Integer.parseInt(st.nextToken()));
            }

            boolean front = true;

            for (int idx=0; idx<line.length(); idx++) {
                switch (line.charAt(idx)) {
                    case 'R':
                        front = !front;
                        break;
                    case 'D':
                        if (deque.size()==0) {
                            sb.append("error\n");
                            continue outer;
                        }

                        if (front) deque.pollFirst();
                        else deque.pollLast();
                        break;
                }
            }

            sb.append("[");
            while (deque.size()>1) {
                if (front) sb.append(deque.pollFirst()+",");
                else sb.append(deque.pollLast()+",");
            }
            if (!deque.isEmpty()) sb.append(deque.pollFirst());
            sb.append("]\n");
        }

        System.out.println(sb.toString());

        br.close();
    }
}
