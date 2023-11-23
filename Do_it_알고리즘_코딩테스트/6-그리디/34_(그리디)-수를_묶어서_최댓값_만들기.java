import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int qnt = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> plusPq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minusPq = new PriorityQueue<>();
        int oneCount = 0;
        int zeroCount = 0;

        for (int i=0; i<qnt; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num>1) plusPq.add(num);
            else if (num<0) minusPq.add(num);
            else if (num==1) oneCount++;
            else if (num==0) zeroCount++;
        }

        int sum = 0;

        // 양수
        while (plusPq.size() > 1) {
            int first = plusPq.remove();
            int second = plusPq.remove();

            sum += first*second;
        }
        if (!plusPq.isEmpty()) sum += plusPq.remove();

        // one
        sum += oneCount;

        // 음수 및 zero
        while (minusPq.size() > 1) {
            int first = minusPq.remove();
            int second = minusPq.remove();

            sum += first*second;
        }
        if (!minusPq.isEmpty() && zeroCount==0) sum += minusPq.remove();

        System.out.println(sum);

        br.close();
    }
}
