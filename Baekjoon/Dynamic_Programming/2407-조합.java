import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int from = Integer.parseInt(st.nextToken());
        int choose = Integer.parseInt(st.nextToken());

        BigInteger[][] dp = new BigInteger[from+1][from+1];
        for (int n=0; n<from+1; n++) {
            dp[n][0] = BigInteger.valueOf(1);
            dp[n][1] = BigInteger.valueOf(n);
            dp[n][n] = BigInteger.valueOf(1);

            for (int r=2; r<n; r++) {
                dp[n][r] = dp[n-1][r-1].add(dp[n-1][r]);
            }
        }

        System.out.println(dp[from][choose]);

        br.close();
    }
}
