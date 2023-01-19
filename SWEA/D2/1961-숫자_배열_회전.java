import java.io.*;
import java.util.*;

public class Solution {
    static int N;
  
    static int[][] rot(int[][] a) {
        int[][] ans = new int[N][N];

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                ans[j][N-i-1] = a[i][j];
            }
        }
        return ans;
    }
  
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int tc=1; tc<=T; tc++) {
            N = Integer.parseInt(br.readLine());
            int[][] mat = new int[N][N];
            for (int i=0; i<N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j=0; j<N; j++) {
                    mat[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int[][] rot90 = rot(mat);
            int[][] rot180 = rot(rot90);
            int[][] rot270 = rot(rot180);

            sb.append("#" + tc + "\n");
            for(int i=0; i<N; i++) {
                for (int j=0; j<N; j++) {
                    sb.append(rot90[i][j]);
                }
                sb.append(" ");

                for (int j=0; j<N; j++) {
                    sb.append(rot180[i][j]);
                }
                sb.append(" ");

                for (int j=0; j<N; j++) {
                    sb.append(rot270[i][j]);
                }
                sb.append("\n");
            }
        }
      
        System.out.println(sb.toString());

        br.close();
    }
}
