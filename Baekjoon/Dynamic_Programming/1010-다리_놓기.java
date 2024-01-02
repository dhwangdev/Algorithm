import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        long[][] dp = new long[31][31];
        for (int i=0; i<31; i++) {
            dp[i][0] = 1;
            dp[i][i] = 1;
            dp[i][1] = i;

            for (int j=2; j<i; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        int tc = Integer.parseInt(br.readLine());
        for (int t=0; t<tc; t++) {
            st = new StringTokenizer(br.readLine());
            int choose = Integer.parseInt(st.nextToken());
            int from = Integer.parseInt(st.nextToken());

            sb.append(dp[from][choose]+"\n");
        }

        System.out.println(sb);

        br.close();
    }
}
