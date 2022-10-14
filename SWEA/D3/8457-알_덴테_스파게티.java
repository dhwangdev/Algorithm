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
			int glass = Integer.parseInt(st.nextToken());
			int time = Integer.parseInt(st.nextToken());
			int margin = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			int num = 0;
			int[] rec = new int[glass];
			for (int i=0; i<glass; i++) {
				rec[i] = Integer.parseInt(st.nextToken());
				
				for (int j=time-margin; j<=time+margin; j++) {
					if (j%rec[i]==0) {
						num++;
						break;
					}
				}
			}// 입력 완료
			
			sb.append("#"+tc+" "+num+"\n");
		}
		System.out.println(sb.toString());
		
		br.close();
	}
}
