import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] dp = new int[a+1][a+1];

        for (int n=0; n<a+1; n++) {
            dp[n][0] = 1;
            dp[n][1] = n;
            dp[n][n] = 1;

            for (int r=2; r<n; r++) {
                dp[n][r] = (dp[n-1][r-1] + dp[n-1][r])%10_007;
            }
        }

        System.out.println(dp[a][b]);

        br.close();
    }
}
