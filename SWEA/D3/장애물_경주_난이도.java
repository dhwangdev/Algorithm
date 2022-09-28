import java.io.*;
import java.util.*;
 
public class Solution {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
 
        int T = Integer.parseInt(br.readLine());
        for (int tc=1; tc<=T; tc++) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int up = 0;
            int down = 0;
            int fir = Integer.parseInt(st.nextToken());
            while (st.hasMoreTokens()) {
                int sec = Integer.parseInt(st.nextToken());
                if (fir<sec) up = Math.max(up, sec-fir);
                if (sec<fir) down = Math.max(down, fir-sec);
                fir = sec;
            }
            sb.append("#"+tc+" "+up+" "+down+"\n");
        }
        System.out.println(sb.toString());
         
        br.close();
    }
}
