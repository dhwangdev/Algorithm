import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int qnt = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        int num = 1;

        for (int i=0; i<qnt; i++) {
            int target = Integer.parseInt(br.readLine());

            if (num <= target) {
                while (num <= target) {
                    stack.offerLast(num++);
                    sb.append("+\n");
                }

                stack.pollLast();
                sb.append("-\n");
            }

            else {
                if (stack.peekLast()==target) {
                    stack.pollLast();
                    sb.append("-\n");
                }
                else {
                    sb.setLength(0);
                    sb.append("NO");
                    break;
                }
            }
        }

        System.out.println(sb);


        br.close();
    }
}
