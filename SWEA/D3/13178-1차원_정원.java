import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int tc = Integer.parseInt(br.readLine());
		for (int T=1; T<=tc; T++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());
			
			int unit = 2*D+1;
			int ans = 0;
			
			if (N%unit==0) ans = N/unit;
			else ans = N/unit + 1;
			
			System.out.printf("#%d %d\n", T, ans);
		}
		
		br.close();
	}
}
