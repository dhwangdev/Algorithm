import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // input
        int qnt = Integer.parseInt(br.readLine());
        int[][] pole = new int[qnt+1][2];
        int[] dp = new int[qnt+1];

        for (int a=1; a<=qnt; a++) {
            st = new StringTokenizer(br.readLine());
            pole[a][0] = Integer.parseInt(st.nextToken());
            pole[a][1] = Integer.parseInt(st.nextToken());
            dp[a] = 1;
        }

        // sort based on left pole
        Arrays.sort(pole, Comparator.comparingInt((int[] arr) -> arr[0]));

        // dp
        for (int a=1; a<=qnt; a++) {
            for (int b=1; b<a; b++) {
                if (pole[b][1] < pole[a][1]) {
                    dp[a] = Math.max(dp[a], dp[b]+1);
                }
            }
        }

        // calc ans
        int canWire = dp[1];
        for (int a=1; a<=qnt; a++) {
            canWire = Math.max(canWire, dp[a]);
        }

        System.out.println(qnt - canWire);

        br.close();
    }
}
