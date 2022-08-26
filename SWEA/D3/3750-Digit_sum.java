import java.io.*;
 
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
 
        int tc = Integer.parseInt(br.readLine());
        for (int T=1; T<=tc; T++) {
            String n = br.readLine();
             
            while (n.length()>1) {
                int temp = 0;
                for (int i=0; i<n.length(); i++) {
                    temp += Character.getNumericValue(n.charAt(i));
                }
                n = Integer.toString(temp);
            }
             
            sb.append("#"+T+" "+n+"\n");
        }
        System.out.println(sb.toString());
         
        br.close();
    }
}
