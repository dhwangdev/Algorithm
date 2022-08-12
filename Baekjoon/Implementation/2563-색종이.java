import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		int[][] board = new int[100][100];
		for (int test=0; test<T; test++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for (int row=100-(y+10); row<100-y; row++) {
				for (int col=x; col<x+10; col++) {
					board[row][col] = 1;
				}
			}
		}
		
		int count = 0;
		for (int row=0; row<100; row++) {
			for (int col=0; col<100; col++) {
				if (board[row][col]==1) {
					count += 1;
				}
			}
		}
		
		System.out.println(count);
		
		br.close();
	}
}
