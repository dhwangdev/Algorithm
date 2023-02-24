import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Deque<Integer> stack = new ArrayDeque<>();

        int K = Integer.parseInt(br.readLine());
        for (int i=0; i<K; i++) {
            int money = Integer.parseInt(br.readLine());
            if (money!=0) stack.offerLast(money);
            else stack.pollLast();
        }

        int sum = 0;

        for (int num: stack) {
            sum += num;
        }
        System.out.println(sum);
        
        br.close();
    }
}
