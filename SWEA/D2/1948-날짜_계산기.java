import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int[] cal = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int T = Integer.parseInt(br.readLine());
        for (int tc=1; tc<=T; tc++) {
            st = new StringTokenizer(br.readLine());
            int staMon = Integer.parseInt(st.nextToken());
            int staDat = Integer.parseInt(st.nextToken());
            int endMon = Integer.parseInt(st.nextToken());
            int endDat = Integer.parseInt(st.nextToken());

            int start = 0;
            int end = 0;

            for (int i=1; i<staMon; i++) {
                start += cal[i];
            }
            start += staDat-1;

            for (int i=1; i<endMon; i++) {
                end += cal[i];
            }
            end += endDat;
            sb.append("#").append(tc).append(" ").append(end-start).append("\n");
        }
        System.out.println(sb);

        br.close();
    }
}
