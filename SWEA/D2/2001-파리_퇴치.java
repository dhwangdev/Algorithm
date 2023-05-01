import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int tc=1; tc<=T; tc++) {
            st = new StringTokenizer(br.readLine());
            int len = Integer.parseInt(st.nextToken());
            int fly = Integer.parseInt(st.nextToken());
            int[][] mat = new int[len][len];

            for (int i=0; i<len; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j=0; j<len; j++) {
                    mat[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int max = -1;
            for (int i=0; i<=len-fly; i++) {
                for (int j=0; j<=len-fly; j++) {

                    int temp = 0;
                    for (int y=i; y<i+fly; y++) {
                        for (int x=j; x<j+fly; x++) {
                            temp += mat[y][x];
                        }
                    }

                    if (max < temp) max = temp;
                }
            }

            sb.append("#"+tc+" "+max+"\n");
        }

        System.out.println(sb);

        br.close();
    }
}
