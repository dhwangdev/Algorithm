import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());
        for (int t=0; t<tc; t++) {
            st = new StringTokenizer(br.readLine());
            int choose = Integer.parseInt(st.nextToken());
            int from = Integer.parseInt(st.nextToken());
            int[][] dp = new int[from+1][from+1];

            for (int n=0; n<from+1; n++) {
                dp[n][0] = 1;
                dp[n][1] = n;
                dp[n][n] = 1;

                for (int r=2; r<n; r++) {
                    dp[n][r] = dp[n-1][r-1] + dp[n-1][r];
                }
            }

            sb.append(dp[from][choose]+"\n");
        }

        System.out.println(sb);

        br.close();
    }
}
