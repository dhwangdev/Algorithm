import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for (int T=1; T<=10; T++) {
			int tc = Integer.parseInt(br.readLine());
			int[][] arr = new int[100][100];
			int max = 0;
			int rise = 0;
			int fall = 0;
			
			for (int i=0; i<100; i++) {
				st = new StringTokenizer(br.readLine());
				int row = 0;
				for (int j=0; j<100; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
					row += arr[i][j];
					if (i==j) fall += arr[i][j]; // 대각선 1
					if (i==100-1-j) rise += arr[i][j]; // 대각선 2
				}
				if (max<row) max = row; // 행 확인
			}
			
			if (max<rise) max = rise;
			if (max<fall) max = fall;
			
			// 열 확인
			for (int j=0; j<100; j++) {
				int col = 0;
				for (int i=0; i<100; i++) {
					col += arr[i][j];
					if (max<col) max = col;
				}
			}
			
			System.out.printf("#%d %d\n", T, max);
		}
		
		br.close();
	}
}
