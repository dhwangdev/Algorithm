import java.io.*;
 
public class Solution {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
 
        int T = Integer.parseInt(br.readLine());
        for (int tc=1; tc<=T; tc++) {
            String word = br.readLine();
            word = word.replaceAll("[a|e|i|o|u]", "");
             
            sb.append("#"+tc+" "+word+"\n");
        }
        System.out.println(sb.toString());
         
        br.close();
    }
}
