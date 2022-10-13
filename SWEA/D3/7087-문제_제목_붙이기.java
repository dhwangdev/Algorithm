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
			String[] arr = new String[N];
			for (int i=0; i<N; i++) {
				arr[i] = br.readLine();
			}// 입력 완료
			
			int count = 1;
			Arrays.sort(arr);
			for (int i=1; i<N; i++) {
				if (arr[0].charAt(0)!='A') {
					count = 0;
					break;
				}
				
				if (arr[i].charAt(0)-arr[i-1].charAt(0)==0) continue; 
				else if (arr[i].charAt(0)-arr[i-1].charAt(0)==1) count++;
				else break;
			}
			sb.append("#"+tc+" "+count+"\n");
		}
		System.out.println(sb.toString());
		
		br.close();
	}
}
