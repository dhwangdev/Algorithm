import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int tc=0; tc<T; tc++) {
            int num = Integer.parseInt(br.readLine());

            long[] dp = new long[num+1];
            dp[1] = 1;

            if (num>=2) dp[2] = 1;
            if (num>=3) dp[3] = 1;

            for (int idx=4; idx<=num; idx++) {
                dp[idx] = dp[idx-2] + dp[idx-3];
            }

            sb.append(dp[num]).append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
