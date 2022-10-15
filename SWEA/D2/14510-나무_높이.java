import java.util.*;
import java.io.*;

public class Solution {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for (int tc=1; tc<=T; tc++) {
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int[] tree = new int[N];
			int goal = 0;
			for (int i=0; i<N; i++) {
				tree[i] = Integer.parseInt(st.nextToken());
				if (tree[i]>goal) goal = tree[i];
			}// 입력 완료
			
			int even = 0;
			int odd = 0;
			for (int i=0; i<N; i++) {
				even += (goal-tree[i])/2;
				odd += (goal-tree[i])%2;
			}
			
			int day = 0;
			if (even==0 && odd==0) day = 0;
			else if (even==0 && odd==1) day = 1;
			else day = Integer.MAX_VALUE;
			int temp = 0;
			while (even>0) {
				if (even>=odd) temp = even*2;
				else temp = odd*2-1;
				
				if (temp<day) day = temp;
				even -= 1;
				odd += 2;
			}
			
			sb.append("#"+tc+" "+day+"\n");
		}
		System.out.println(sb.toString());
		
		br.close();
	}
}
