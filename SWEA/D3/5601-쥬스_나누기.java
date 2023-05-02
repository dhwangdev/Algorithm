import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int tc=1; tc<=T; tc++) {
            int num = Integer.parseInt(br.readLine());
            sb.append("#"+tc+" ");
            for (int i=0; i<num; i++) {
                sb.append("1/"+num+" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
