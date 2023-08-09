import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int qnt = Integer.parseInt(st.nextToken());
        int maxWeight = Integer.parseInt(st.nextToken());
        int[] w = new int[qnt+1];
        int[] v = new int[qnt+1];
        int[] dp = new int[maxWeight+1];

        for (int i=1; i<=qnt; i++) {
            st = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=1; i<=qnt; i++) {
            for (int j=maxWeight; j-w[i]>=0; j--) {
                dp[j] = Math.max(dp[j], dp[j-w[i]] + v[i]);
            }
        }

        System.out.println(dp[maxWeight]);

        br.close();
    }
}
