import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int[] dp = new int[1001];
        // odd SK, even CY
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 1;
        for (int i=4; i<=num; i++) {
            dp[i] = Math.min(dp[i-1], dp[i-3]) + 1;
        }

        if (dp[num]%2==1) System.out.println("SK");
        else System.out.println("CY");
        
        br.close();
    }
}
