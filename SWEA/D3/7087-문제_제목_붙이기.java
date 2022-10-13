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
			
			int count = 0;
			Arrays.sort(arr);
			for (int i=1; i<N; i++) {
				if (arr[0].charAt(0)=='a') count++;
				
				if (arr[i].charAt(0)-arr[i-1].charAt(0)==0 || arr[i].charAt(0)-arr[i-1].charAt(0)==1) {
					
				}
			}
		}
		
		br.close();
	}
}
