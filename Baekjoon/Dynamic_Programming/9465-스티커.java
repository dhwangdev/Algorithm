import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());
        for (int t=0; t<tc; t++) {
            int col = Integer.parseInt(br.readLine());
            int[][] sticker = new int[2][col+1];
            for (int i=0; i<2; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j=1; j<=col; j++) {
                    sticker[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int[][] dp = new int[2][col+1];
            dp[0][1] = sticker[0][1];
            dp[1][1] = sticker[1][1];

            for (int x=2; x<=col; x++) {
                dp[0][x] = Math.max(dp[1][x-1], dp[1][x-2]) + sticker[0][x];
                dp[1][x] = Math.max(dp[0][x-1], dp[0][x-2]) + sticker[1][x];
            }

            sb.append(Math.max(dp[0][col], dp[1][col])+"\n");
        }

        System.out.println(sb);

        br.close();
    }
}
