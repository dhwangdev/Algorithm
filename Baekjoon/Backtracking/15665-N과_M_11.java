import java.util.*;
import java.io.*;

public class Main {
	static int len, lim;
	static int[] arr, output;
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
			if (arr[idx] != before) {
				output[depth] = arr[idx];
				before = arr[idx];
				dfs(depth+1);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		len = Integer.parseInt(st.nextToken());
		lim = Integer.parseInt(st.nextToken());
		arr = new int[len];
		output = new int[lim];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<len; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		dfs(0);
		System.out.println(sb);
		
		br.close();
	}
}
