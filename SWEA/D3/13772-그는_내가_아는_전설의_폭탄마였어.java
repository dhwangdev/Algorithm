import java.io.*;
import java.util.*;

public class Solution {
	static int T, N, P;
	static int[][] mat;
	
	static int plus(int i, int j) {
		int sum = 0;
		
		// + 형태
		// 원점
		sum += mat[i][j];
		// 위
		for (int sub=1; sub<=P; sub++) {
			if (i-sub>=0) sum+= mat[i-sub][j];
		}
		// right
		for (int sub=1; sub<=P; sub++) {
			if (j+sub<=N-1) sum+= mat[i][j+sub];
		}
		// down
		for (int sub=1; sub<=P; sub++) {
			if (i+sub<=N-1) sum+= mat[i+sub][j];
		}
		// left
		for (int sub=1; sub<=P; sub++) {
			if (j-sub>=0) sum+= mat[i][j-sub];
		}
		
		return sum;
	}
	
	static int cross(int i, int j) {
		int sum = 0;
		
		// + 형태
		// 원점
		sum += mat[i][j];
		// 11시
		for (int sub=1; sub<=P; sub++) {
			if (i-sub>=0 && j-sub>=0) sum+= mat[i-sub][j-sub];
		}
		// 2시
		for (int sub=1; sub<=P; sub++) {
			if (i-sub>=0 && j+sub<=N-1) sum+= mat[i-sub][j+sub];
		}
		// 5시
		for (int sub=1; sub<=P; sub++) {
			if (i+sub<=N-1 && j+sub<=N-1) sum+= mat[i+sub][j+sub];
		}
		// 7시
		for (int sub=1; sub<=P; sub++) {
			if (i+sub<=N-1 && j-sub>=0) sum+= mat[i+sub][j-sub];
		}
		
		return sum;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		T = Integer.parseInt(br.readLine());
		for (int tc=1; tc<=T; tc++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			P = Integer.parseInt(st.nextToken());
			mat = new int[N][N];
			for (int i=0; i<N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j=0; j<N; j++) {
					mat[i][j] = Integer.parseInt(st.nextToken());
				}
			}// 입력 완료
			
			int ans = 0;
			for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					int temp = Math.max(plus(i, j), cross(i, j));
					if (temp>ans) ans = temp;
				}
			}
			
			sb.append("#"+tc+" "+ans+"\n");
		}
		System.out.println(sb.toString());
		
		br.close();
	}
}
