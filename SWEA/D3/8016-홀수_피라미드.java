import java.io.*;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for (int tc=1; tc<=T; tc++) {
			long N = Long.parseLong(br.readLine());
			
			long start = (N-1)*(N-1)*2+1;
			long end = N*N*2-1;
			
			sb.append("#"+tc+" "+start+" "+end+"\n");
		}
		System.out.println(sb.toString());
		br.close();
	}//main
}
