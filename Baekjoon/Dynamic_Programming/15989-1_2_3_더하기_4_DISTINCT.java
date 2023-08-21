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

        int[][] dp = new int[most+1][4];
        dp[1][1] = 1;
        dp[2][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;

        for (int i=4; i<=most; i++) {
            dp[i][1] = dp[i-1][1];
            dp[i][2] = dp[i-2][1] + dp[i-2][2];
            dp[i][3] = dp[i-3][1] + dp[i-3][2] + dp[i-3][3];
        }

        for (int num: arr) {
            sb.append(dp[num][1]+dp[num][2]+dp[num][3]).append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
