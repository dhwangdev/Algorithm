import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        long[] dp = new long[num+1];
        dp[1] = 1;
        if (num>=2) {
            dp[2] = 2;

            for (int i=3; i<=num; i++) {
                dp[i] = (dp[i-1] + dp[i-2])%10_007;
            }
        }

        System.out.println(dp[num]);

        br.close();
    }
}
