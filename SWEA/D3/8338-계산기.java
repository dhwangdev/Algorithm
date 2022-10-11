import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for (int tc=1; tc<=T; tc++) {
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int[] num = new int[N];
			for (int i=0; i<N; i++) {
				num[i] = Integer.parseInt(st.nextToken());
			}
			
			int ans = num[0];
			
			for (int i=1; i<N; i++) {
				if (ans==1 || num[i]==1 || ans==0 || num[i]==0) ans += num[i];
				else ans *= num[i];
			}
			sb.append("#"+tc+" "+ans+"\n");
		}
		System.out.println(sb.toString());
		
		br.close();
	}
}
