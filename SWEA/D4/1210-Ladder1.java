import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int test=0; test<10; test++) {
			int T = Integer.parseInt(br.readLine());
			
			int[][] board = new int[100][100];
			int row = 0;
			int col = 0;
			for (int Y=0; Y<100; Y++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int X=0; X<100; X++) {
					board[Y][X] = Integer.parseInt(st.nextToken());
					
					if (board[Y][X] == 2) {
						row = Y;
						col = X;
					}
				}
			}
			
			while (row!=0) {
				if (col>0 && board[row][col-1] == 1) {
					while (col>0 && board[row][col-1] == 1) {
						col -= 1;
					} 
				} else if (col<99 && board[row][col+1]==1) {
					while (col<99 && board[row][col+1]==1) {
						col += 1;
					}
				}
				row -= 1;
			}
			
			System.out.printf("#%d %d", T, col);
			System.out.println();
		}
		br.close();
	}
}
