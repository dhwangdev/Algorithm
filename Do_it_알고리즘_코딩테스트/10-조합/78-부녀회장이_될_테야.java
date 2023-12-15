import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[][] dp = new int[15][15];

        for (int floor=0; floor<15; floor++) {
            for (int room=1; room<15; room++) {
                if (floor==0) dp[0][room] = room;
                else dp[floor][room] = dp[floor][room-1] + dp[floor-1][room];
            }
        }

        int t = Integer.parseInt(br.readLine());
        for (int tc=0; tc<t; tc++) {
            int storey = Integer.parseInt(br.readLine());
            int num = Integer.parseInt(br.readLine());

            sb.append(dp[storey][num]+"\n");
        }

        System.out.println(sb);

        br.close();
    }
}
