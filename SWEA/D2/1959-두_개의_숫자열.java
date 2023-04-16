import java.io.*;
import java.util.*;

class Solution {

    static int calc(int[] exp, int[] con) {
        int max = 0;

        for (int i=0; i<=exp.length-con.length; i++) {
            int sum = 0;
            for (int j=0; j<con.length; j++) {
                sum += exp[i+j]*con[j];
            }
            if (max<sum) max = sum;
        }
        return max;
    } // calc

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc=1; tc<=T; tc++) {
            st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());
            int[] arrOne = new int[one];
            st = new StringTokenizer(br.readLine());
            for (int i=0; i<one; i++) {
                arrOne[i] = Integer.parseInt(st.nextToken());
            }
            int[] arrTwo = new int[two];
            st = new StringTokenizer(br.readLine());
            for (int i=0; i<two; i++) {
                arrTwo[i] = Integer.parseInt(st.nextToken());
            }

            sb.append("#"+tc+" ");
            if (one < two) sb.append(calc(arrTwo, arrOne)+"\n");
            else sb.append(calc(arrOne, arrTwo)+"\n");
        }
        System.out.println(sb);

        br.close();
    }
}
