import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int qnt = Integer.parseInt(br.readLine());
        int[] numArr = new int[qnt];
        int[] useArr = new int[qnt];

        int most = 1;
        for (int i=0; i<qnt; i++) {
            st = new StringTokenizer(br.readLine());
            numArr[i] = Integer.parseInt(st.nextToken());
            useArr[i] = Integer.parseInt(st.nextToken());
            most = Math.max(most, numArr[i]);
        }

        long[][] dp = new long[most+3][most+3];
        dp[1][1] = 1; // 1
        dp[2][2] = 1; // 11
        dp[2][1] = 1; // 2
        dp[3][3] = 1; // 111
        dp[3][2] = 2; // 12, 21
        dp[3][1] = 1; // 3

        int use = 1;
        for (int i=4; i<=most; i++) {
            if (i%3==0) use = i/3;
            else use = i/3+1;
            for (int j=use; j<=i; j++) {
                dp[i][j] = (dp[i-1][j-1]+dp[i-2][j-1]+dp[i-3][j-1])%1_000_000_009;
            }
        }

        for (int i=0; i<qnt; i++) {
            sb.append(dp[numArr[i]][useArr[i]]).append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
