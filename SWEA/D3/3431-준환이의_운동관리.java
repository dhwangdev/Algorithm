import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int tc=1; tc<=T; tc++) {
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int U = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());

            sb.append("#"+tc+" ");

            if (X<L) sb.append(L-X + "\n");
            else if(L<=X && X<=U) sb.append(0+"\n");
            else sb.append(-1 + "\n");
        }

        System.out.println(sb);

        br.close();
    }
}
