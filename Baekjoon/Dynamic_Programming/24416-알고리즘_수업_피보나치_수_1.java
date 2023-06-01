import java.util.*;
import java.io.*;

public class Main {
    static int num, dfsCount, dpCount;
    static int[] memo;

    static int dfs(int number) {
        if (number==1 || number==2) {
            dfsCount++;
            return 1;
        }
        else return (dfs(number-1) + dfs(number-2));
    }

    static int dp(int number) {
        memo[1] = 1;
        memo[2] = 1;

        for (int idx=3; idx<=number; idx++) {
            dpCount++;
            memo[idx] = memo[idx-1] + memo[idx-2];
        }
        return memo[number];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        num = Integer.parseInt(br.readLine());
        memo = new int[num+1];

        dfs(num);
        dp(num);
        System.out.println(dfsCount + " " + dpCount);

        br.close();
    }
}
