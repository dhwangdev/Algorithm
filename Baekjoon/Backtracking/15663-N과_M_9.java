import java.util.*;
import java.io.*;

public class Main {
	static int len, lim;
	static int[] arr, output;
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();
	
	static void dfs(int depth) {
		if (depth==lim) {
			for (int i=0; i<lim; i++) {
				sb.append(output[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		int before = 0;
		for (int idx=0; idx<len; idx++) {
			if (!visit[idx] && before!=arr[idx]) {
				visit[idx] = true;
				output[depth] = arr[idx];
				before = arr[idx];
				dfs(depth+1);
				visit[idx] = false;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// input
		st = new StringTokenizer(br.readLine());
		len = Integer.parseInt(st.nextToken());
		lim = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		arr = new int[len];
		for (int i=0; i<len; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		// initialize
		output = new int[lim];
		visit = new boolean[len];	
		
		// dfs
		dfs(0);
		System.out.println(sb);
		
		br.close();
	}
}
