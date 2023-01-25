import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int tc=1; tc<=T; tc++) {
            char[] line = br.readLine().toCharArray();
            Arrays.sort(line);
            int count = 1;
            for (int i=1; i<line.length; i++) {
                if (line[i]!=line[i-1]) count++;
            }
            sb.append("#" + tc + " " + count + "\n");
        }
        System.out.println(sb.toString());

        br.close();
    }
}
