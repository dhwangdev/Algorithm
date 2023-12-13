import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        long[][] dp = new long[num+1][2];
        dp[1][1] = 1;

        if (num>=2) {
            dp[2][0] = 1; // 10

            for (int i=3; i<=num; i++) {
                dp[i][0] = dp[i-1][0]+dp[i-1][1];
                dp[i][1] = dp[i-1][0];
            }
        }

        System.out.println(dp[num][0]+dp[num][1]);

        br.close();
    }
}
