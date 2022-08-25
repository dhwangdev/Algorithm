import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int tc = Integer.parseInt(br.readLine());
		for (int T=1; T<=tc; T++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int ans=0;
			
			if (A/10>0 || B/10>0) ans = -1;
			else ans = A*B;
			
			System.out.printf("#%d %d\n", T, ans);
		}
		
		
		br.close();
	}
}
