import java.io.*;
import java.util.*;
 
public class Solution {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
         
        int T = Integer.parseInt(br.readLine());
        for (int tc=1; tc<= T; tc++) {
            st = new StringTokenizer(br.readLine());
            int total = Integer.parseInt(st.nextToken());
            int choose = Integer.parseInt(st.nextToken());
            int[] arr = new int[total];
            st = new StringTokenizer(br.readLine());
            for (int i=0; i<total; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
             
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i=0; i<=total-choose; i++) {
                int sum = 0;
                for (int j=i; j<= i+choose-1; j++) {
                    sum+= arr[j];
                }
                if (sum > max) max = sum;
                if (sum < min) min = sum;
            }
            int ans = max - min;
             
            sb.append("#"+tc+" "+ans+"\n");
        }
        System.out.println(sb.toString());
         
        br.close();
    }
}
