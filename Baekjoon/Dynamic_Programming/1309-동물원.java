import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[][] dp = new int[num+1][3];

        dp[1][0] = 1;
        dp[1][1] = 1;
        dp[1][2] = 1;

        for (int i=2; i<=num; i++) {
            // j=0 해당 row가 다 비워졌음
            dp[i][0] = (dp[i-1][0] + dp[i-1][1] + dp[i-1][2])%9901;

            // j=1 left col 사자
            dp[i][1] = (dp[i-1][0] + dp[i-1][2])%9901;

            // j=2 right col 사자
            dp[i][2] = (dp[i-1][0] + dp[i-1][1])%9901;
        }

        System.out.println((dp[num][0]+dp[num][1]+dp[num][2])%9901);

        br.close();
    }
}
