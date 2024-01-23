import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int finish = Integer.parseInt(st.nextToken());

        int num = Math.abs(finish-start);
        long[][] dp = new long[num+1][num+1];
        dp[0][0] = 1;
        for (int i=1; i<num+1; i++) {
            for (int j=i; j<num+1; j++) {
                if (i==1) dp[i][j] = j;
                else dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        System.out.println(dp[num][num]);

        br.close();
    }
}
