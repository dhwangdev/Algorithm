import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[][] dp = new long[N+1][2];

        dp[1][1] = 1; // 1

        if (N>1) dp[2][0] = 1;// 10

        for (int i=3; i<N+1; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-1][1];
            dp[i][1] = dp[i-1][0];
        }

        System.out.println(dp[N][0]+dp[N][1]);

        br.close();
    }
}
