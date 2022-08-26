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
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int[] num = new int[N*M];
			int idx=0;
			for (int i=1; i<=M; i++) {
				for (int j=1; j<=N; j++) {
					num[idx] = i+j;
					idx++;
				}
			}
			
			Arrays.sort(num);
			
			int max = 0;
			int[] count = new int[num[num.length-1]+1];
			for (int ele : num) {
				count[ele]++;
				if (max<count[ele]) max = count[ele];
			}
			
			sb.append("#"+T+" ");
			
			for (int ans=0; ans<count.length; ans++) {
				if (count[ans] == max) sb.append(ans+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		
		br.close();
	}
}
