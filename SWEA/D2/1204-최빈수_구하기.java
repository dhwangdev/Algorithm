import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int tc=1; tc<=T; tc++) {
			int test = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int[] score = new int[101];
			while (st.hasMoreTokens()) {
				score[Integer.parseInt(st.nextToken())]++;
			}
			
			int[] temp = Arrays.copyOf(score, 101);
			Arrays.sort(temp);
			
			for (int num=100; num>=0; num--) {
				if (temp[100]==score[num]) {
					System.out.printf("#%d %d", test, num);
					System.out.println();
					break;
				}
			}	
		}
		br.close();
	}
}
