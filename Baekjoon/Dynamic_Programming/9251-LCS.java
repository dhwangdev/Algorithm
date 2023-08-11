import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String one = br.readLine();
        String two = br.readLine();
        int[][] dp = new int[one.length()+1][two.length()+1];

        for (int i=1; i<=one.length(); i++) {
            for (int j=1; j<=two.length(); j++) {
                if (one.charAt(i-1)==two.charAt(j-1)) dp[i][j] = dp[i-1][j-1]+1;
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }

        System.out.println(dp[one.length()][two.length()]);

        br.close();
    }
}
