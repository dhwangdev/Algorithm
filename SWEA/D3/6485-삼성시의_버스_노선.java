import java.io.*;
import java.util.*;
 
public class Solution {
    static int T, N, P;
    static int[] A, B, C;
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());
        for (int tc=1; tc<=T; tc++) {
            N = Integer.parseInt(br.readLine());
            A = new int[N];
            B = new int[N];
            for (int i=0; i<N; i++) {
                st = new StringTokenizer(br.readLine());
                A[i] = Integer.parseInt(st.nextToken()); 
                B[i] = Integer.parseInt(st.nextToken());
            }
            P = Integer.parseInt(br.readLine());
            C = new int[P];
            for (int i=0; i<P; i++) {
                C[i] = Integer.parseInt(br.readLine());
            }
            // input 
             
            int[] ans = new int[P];
            for (int j=0; j<P; j++) {
                for (int i=0; i<N; i++) {
                    if (C[j]>= A[i] && C[j]<=B[i]) ans[j]++;
                }
            }
             
            sb.append("#"+tc+" ");
            for (int count: ans) {
                sb.append(count+" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
         
        br.close();
    }
}
