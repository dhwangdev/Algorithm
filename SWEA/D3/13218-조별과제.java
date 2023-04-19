import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int tc=1; tc<=T; tc++) {
            int num = Integer.parseInt(br.readLine());
            sb.append("#"+tc+" "+num/3+"\n");
        }
        System.out.println(sb);

        br.close();
    }
}
