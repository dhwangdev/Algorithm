import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int tc=0; tc<T; tc++) {
            Deque<Character> stack = new ArrayDeque<>();
            String line = br.readLine();
            for (int i=0; i<line.length(); i++) {
                if (line.charAt(i)=='(') stack.offerLast('(');
                else {
                    if (stack.isEmpty()) {
                        stack.offerLast(')');
                        break;
                    }
                    else stack.pollLast();
                }
            }

            if (stack.isEmpty()) sb.append("YES\n");
            else sb.append("NO\n");
        }
        System.out.println(sb.toString());

        br.close();
    }
}
