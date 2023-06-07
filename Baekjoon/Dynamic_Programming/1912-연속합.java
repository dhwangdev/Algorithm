import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int len = Integer.parseInt(br.readLine());
        int[] arr = new int[len+1];
        int[] dp = new int[len+1];
        int max = Integer.MIN_VALUE;
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=len; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = Math.max(arr[i], dp[i-1]+arr[i]);
            max = Math.max(dp[i], max);
        }

        System.out.println(max);

        br.close();
    }
}
