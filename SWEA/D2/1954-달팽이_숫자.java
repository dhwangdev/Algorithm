import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for (int tc=1; tc<=T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[][] mat = new int[N][N];
			
			int[][] move = {{0,1}, {1,0}, {0,-1}, {-1,0}};
			int turn = 0;
			
			int r = 0;
			int c = 0;
			int num = 1;
			int nr = 0;
			int nc = 0;
			
			mat[r][c] = num;
			
			while (num < N*N) {
				nr = r + move[turn][0];
				nc = c + move[turn][1];
				
				if (nr<0 || nr>=N || nc<0 || nc>=N || mat[nr][nc]!=0) {
					turn++;
					if (turn==4) turn = 0;
					continue;
				}
				
				r = nr;
				c = nc;
				
				mat[r][c] = ++num;
			}
			sb.append("#" + tc + "\n");
			
			for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					sb.append(mat[i][j] + " ");
				}
				sb.append("\n");
			}
			
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
