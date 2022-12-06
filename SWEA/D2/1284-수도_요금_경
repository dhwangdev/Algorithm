import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for (int tc=1; tc<=T; tc++) {
			st = new StringTokenizer(br.readLine());
			int P = Integer.parseInt(st.nextToken());
			int Q = Integer.parseInt(st.nextToken());
			int R = Integer.parseInt(st.nextToken());
			int S = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			
			int fir = P*W;
			int sec = 0;
			if (W<=R) {
				sec = Q;
			} else {
				sec = Q + (W-R)*S;
			}
			
			int ans = Math.min(fir, sec);
			sb.append("#" + tc + " " + ans + "\n");
		}
		System.out.println(sb.toString());
		
		br.close();
	}
}
