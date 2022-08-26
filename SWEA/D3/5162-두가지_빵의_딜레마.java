import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
			
		int tc = Integer.parseInt(br.readLine());
		for (int T=1; T<=tc; T++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			int ans = C/(Math.min(A, B));
			sb.append("#"+T+" "+ans+"\n");
		}
		System.out.println(sb.toString());
		
		br.close();
	}
}
