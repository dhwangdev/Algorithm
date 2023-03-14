import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int tc=0; tc<T; tc++) {
            st = new StringTokenizer(br.readLine());
            int total = Integer.parseInt(st.nextToken());
            int pos = Integer.parseInt(st.nextToken());

            Deque<int[]> queue = new ArrayDeque<>();
            st = new StringTokenizer(br.readLine());
            for (int i=0; i<total; i++) {
                queue.offerLast(new int[] {i, Integer.parseInt(st.nextToken())});
            }

            int order = 0;

            while (true) {
                int[] temp = queue.pollFirst();
                boolean isMax = true;

                for (int[] numArr: queue) {
                    if (temp[1]<numArr[1]) {
                        queue.offerLast(temp);
                        isMax = false;
                        break;
                    }
                }

                if (isMax) {
                    order++;
                    if (temp[0]==pos) break;
                }
            }

            sb.append(order +"\n");
        }
        System.out.println(sb.toString());

        br.close();
    }
}
