import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int tc=1; tc<=T; tc++) {
            int len = Integer.parseInt(br.readLine());

            char[] parent = br.readLine().toCharArray();
            char[] child = br.readLine().toCharArray();

            int count = 0;
            for (int i=0; i<len; i++) {
                if (parent[i]==child[i]) count++;
            }

            sb.append("#"+tc+" "+count+"\n");
        }
        System.out.println(sb.toString());

        br.close();
    }
}
