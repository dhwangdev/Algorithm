import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());
        int[] arr = new int[len+1];
        int[] dp = new int[len+1];
        for (int idx=1; idx<=len; idx++) {
            arr[idx] = Integer.parseInt(br.readLine());
        }

        dp[1] = arr[1];
        if (len>=2) dp[2] = arr[1]+arr[2];
        for (int idx=3; idx<=len; idx++) {
            dp[idx] = Math.max((dp[idx-2]+arr[idx]), dp[idx-3]+arr[idx-1]+arr[idx]);
        }

        System.out.println(dp[len]);

        br.close();
    }
}
