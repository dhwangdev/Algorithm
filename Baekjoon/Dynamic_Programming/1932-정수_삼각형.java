import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int len = Integer.parseInt(br.readLine());
        int[][] tri = new int[len][len];
        int temp = 1;
        for (int i=0; i<len; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<temp; j++) {
                tri[i][j] = Integer.parseInt(st.nextToken());
            }
            temp++;
        }

        int[][] dp = new int[len][len];
        dp[0][0] = tri[0][0];
        for (int idx=1; idx<len; idx++) {
            //leftmost
            dp[idx][0] = tri[idx][0] + dp[idx-1][0];

            //rightmost
            dp[idx][idx] = tri[idx][idx] + dp[idx-1][idx-1];

            //middle
            for (int col=1; col<=idx-1; col++) {
                dp[idx][col] = Math.max(dp[idx-1][col-1], dp[idx-1][col]) + tri[idx][col];
            }
        }

        int max = -1;
        for (int col=0; col<len; col++) {
            max = Math.max(max, dp[len-1][col]);
        }
        System.out.println(max);

        br.close();
    }
}
