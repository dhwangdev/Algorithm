import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[][] mat = new int[y+1][x+1];
        int[][] dp = new int[y+1][x+1];

        for (int i=1; i<=y; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=x; j++) {
                mat[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = Math.max(dp[i-1][j]+mat[i][j], dp[i][j-1]+mat[i][j]);
            }
        }

        System.out.println(dp[y][x]);

        br.close();
    }
}
