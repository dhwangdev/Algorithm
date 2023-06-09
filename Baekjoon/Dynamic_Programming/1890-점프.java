import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int len = Integer.parseInt(br.readLine());
        int[][] mat = new int[len][len];
        long[][] dp = new long[len][len];
        for (int i=0; i<len; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<len; j++) {
                mat[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = 1;
        for (int row=0; row<len; row++) {
            for (int col=0; col<len; col++) {
                if (row==len-1 && col==len-1) break;
                int num = mat[row][col];
                if (col+num<len) dp[row][col+num] += dp[row][col];
                if (row+num<len) dp[row+num][col] += dp[row][col];
            }
        }

        System.out.println(dp[len-1][len-1]);
        
        br.close();
    }
}
