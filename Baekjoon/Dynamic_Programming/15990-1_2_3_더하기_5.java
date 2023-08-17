import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int qnt = Integer.parseInt(br.readLine());
        int[] arr = new int[qnt+1];
        int most = 1;
        for (int i=1; i<=qnt; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            most = Math.max(most, arr[i]);
        }

        long[][] dp = new long[most+1][4];

        dp[1][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;

        for (int i=4; i<=most; i++) {
            dp[i][1] = (dp[i-1][2]+dp[i-1][3])%1_000_000_009;
            dp[i][2] = (dp[i-2][1]+dp[i-2][3])%1_000_000_009;
            dp[i][3] = (dp[i-3][1]+dp[i-3][2])%1_000_000_009;
        }

        for (int i=1; i<=qnt; i++) {
            sb.append((dp[arr[i]][1] + dp[arr[i]][2] + dp[arr[i]][3])%1_000_000_009).append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
