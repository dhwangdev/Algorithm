import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine()); 
		int num = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[N][N];
		int row = N/2;
		int col = N/2;
		
		int y = 0;
		int x = 0;
		arr[row][col] = 1;
		if (arr[row][col]==num) {
			y = row+1;
			x = col+1;
		}
		int count = 1;
		int[][] del = {{-1,0}, {0,1}, {1,0}, {0,-1}};
		int dir = 0;
		
		for (int rep=1; rep<=N-1; rep++) {
			for (int add=0; add<rep; add++) {
				row += del[dir][0];
				col += del[dir][1];
				arr[row][col] = ++count;
				if (arr[row][col]==num) {
					y = row+1;
					x = col+1;
				}
			}	
			dir++;
			
			for (int add=0; add<rep; add++) {
				row += del[dir][0];
				col += del[dir][1];
				arr[row][col] = ++count;
				if (arr[row][col]==num) {
					y = row+1;
					x = col+1;
				}
			}
			dir++;
			dir %= 4;
		}
		
		for (int add=0; add<N-1; add++) {
			row += del[dir][0];
			col += del[dir][1];
			arr[row][col] = ++count;
			if (arr[row][col]==num) {
				y = row+1;
				x = col+1;
			}
		}	
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				sb.append(arr[i][j]+" ");
			}
			sb.append("\n");
		}
		sb.append(y + " " + x);
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
