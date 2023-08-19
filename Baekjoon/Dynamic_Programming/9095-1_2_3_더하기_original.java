import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int qnt = Integer.parseInt(br.readLine());
        int[] arr = new int[qnt+1];

        int end = 1;
        for (int i=1; i<=qnt; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            end = Math.max(end, arr[i]);
        }
        int[] dp = new int[end+1];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i=4; i<=end; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        for (int i=1; i<=qnt; i++) {
            sb.append(dp[arr[i]]).append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
