import java.util.*;
import java.io.*;

public class Main {
	static int len;
	static int[][] mat;
	static boolean[] visit;
	static int min = Integer.MAX_VALUE;
	
	static void dfs(int depth, int sum, int curr_idx) {
		if (depth==len-1) {
			if (mat[curr_idx][0]!=0) {
				min = Math.min(min, sum+mat[curr_idx][0]);
			}
			return;
		}
		
		for (int idx=0; idx<len; idx++) {
			if (!visit[idx] && mat[curr_idx][idx]!=0) {
				visit[idx] = true;
				dfs(depth+1, sum+mat[curr_idx][idx], idx);
				visit[idx] = false;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		len = Integer.parseInt(br.readLine());
		mat = new int[len][len];
		visit = new boolean[len];
		for (int i=0; i<len; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<len; j++) {
				mat[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		visit[0] = true;
		dfs(0, 0, 0);
		System.out.println(min);
		
		br.close();
	}
}
