import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int qnt = Integer.parseInt(br.readLine());
        int[] arr = new int[qnt+1];
        int[] dp = new int[qnt+1];

        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=qnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }

        int most = 1;
        for (int i=1; i<=qnt; i++) {
            for (int j=1; j<i; j++) {
                if (arr[j]<arr[i] && dp[i]<=dp[j]) {
                    dp[i] = dp[j]+1;
                }
            }
            most = Math.max(most, dp[i]);
        }

        System.out.println(most);

        br.close();
    }
}
