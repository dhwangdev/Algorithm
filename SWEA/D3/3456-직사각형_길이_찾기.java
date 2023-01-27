import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int tc=1; tc<=T; tc++) {
            st = new StringTokenizer(br.readLine());
            int[] side = new int[3];
            for (int i=0; i<3; i++) {
                side[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(side);

            int ans = 0;
            ans = (side[0]==side[1]) ? side[2] : side[0];

            sb.append("#"+tc+" "+ans+"\n");
        }
        System.out.println(sb.toString());

        br.close();
    }
}
