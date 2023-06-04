import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int len = Integer.parseInt(br.readLine());
        int[][] dp = new int[len+1][3];
        int red = 0;
        int green = 1;
        int blue = 2;

        for (int idx=1; idx<=len; idx++) {
            st = new StringTokenizer(br.readLine());
            dp[idx][red] = Math.min(dp[idx-1][green], dp[idx-1][blue]) + Integer.parseInt(st.nextToken());
            dp[idx][green] = Math.min(dp[idx-1][red], dp[idx-1][blue]) + Integer.parseInt(st.nextToken());
            dp[idx][blue] = Math.min(dp[idx-1][red], dp[idx-1][green]) + Integer.parseInt(st.nextToken());
        }

        System.out.println(Math.min(dp[len][red], Math.min(dp[len][green], dp[len][blue])));

        br.close();
    }
}
