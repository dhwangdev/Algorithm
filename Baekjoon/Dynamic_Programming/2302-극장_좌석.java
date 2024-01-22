import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int qnt = Integer.parseInt(br.readLine());
        int[] dp = new int[qnt+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int idx=2; idx<=qnt; idx++) {
            dp[idx] = dp[idx-1] + dp[idx-2];
        }

        int vipQnt = Integer.parseInt(br.readLine());
        int ans = 1;
        int start = 0;
        for (int ite=0; ite<vipQnt; ite++) {
            int vip = Integer.parseInt(br.readLine());
            ans *= dp[vip-start-1];
            start = vip;
        }

        ans *= dp[qnt-start];

        System.out.println(ans);

        br.close();
    }
}
