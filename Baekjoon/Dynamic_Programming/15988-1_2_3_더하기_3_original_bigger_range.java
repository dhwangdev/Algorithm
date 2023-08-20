import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int qnt = Integer.parseInt(br.readLine());
        int[] arr = new int[qnt];
        int most = 1;
        for (int i=0; i<qnt; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            most = Math.max(most, arr[i]);
        }

        long[] dp = new long[most+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i=4; i<=most; i++) {
            dp[i] = (dp[i-1]+dp[i-2]+dp[i-3])%1_000_000_009;
        }

        for (int num: arr) {
            sb.append(dp[num]).append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
