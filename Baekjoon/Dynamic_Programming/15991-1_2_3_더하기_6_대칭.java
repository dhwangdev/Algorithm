import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int qnt = Integer.parseInt(br.readLine());
        int most = 1;
        int[] arr = new int[qnt];
        for (int i=0; i<qnt; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            most = Math.max(most, arr[i]);
        }

        long[] dp = new long[most+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 2;

        for (int i=4; i<=most; i++) {
            if (i-6<0) {
                dp[i] = (dp[i-2] + dp[i-4])%1_000_000_009;
            }

            else {
                dp[i] = (dp[i-2] + dp[i-4] + dp[i-6])%1_000_000_009;
            }
        }

        for (int num: arr) {
            sb.append(dp[num]).append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
