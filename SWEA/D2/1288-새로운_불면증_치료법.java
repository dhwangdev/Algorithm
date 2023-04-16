import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int tc=1; tc<=T; tc++) {
            int input = Integer.parseInt(br.readLine());
            int count = 0;
            HashSet<Integer> hs = new HashSet<>();
            while (hs.size()!=10) {
                count++;
                for (int num=input*count; num>0; num/=10) {
                    hs.add(num%10);
                }
            }
            sb.append("#"+tc+" "+input*count+"\n");
        }
        System.out.println(sb);

        br.close();
    }
}
