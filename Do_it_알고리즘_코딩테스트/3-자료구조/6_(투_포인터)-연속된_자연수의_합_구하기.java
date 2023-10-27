import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int target = Integer.parseInt(br.readLine());
        int start = 1;
        int end = 1;
        int sum = 1;
        int count = 1;

        while (end!=target) {
            if (sum==target) {
                count++;
                end++;
                sum += end;
            } else if (sum>target) {
                sum -= start;
                start++;
            } else if (sum<target) {
                end++;
                sum += end;
            }
        }

        System.out.println(count);

        br.close();
    }
}
