import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		int[][] board = new int[102][102];
		for (int test=0; test<T; test++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for (int row=100-(y+10)+1; row<100-y+1; row++) {
				for (int col=x+1; col<x+10+1; col++) {
					board[row][col] = 1;
				}
			}
		}
		
		// check row
		int count = 0;
		for (int row=1; row<102; row++) {
			for (int col=1; col<102; col++) {
				if (board[row][col]!=board[row][col-1]) {
					count += 1;
				}
			}
		}
		
		// check col
		for (int col=1; col<102; col++) {
			for (int row=1; row<102; row++) {
				if (board[row][col]!=board[row-1][col]) {
					count += 1;
				}
			}
		}
		
		System.out.println(count);
		
		br.close();
	}
}
