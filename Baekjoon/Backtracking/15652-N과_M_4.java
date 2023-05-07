import java.util.*;
import java.io.*;

public class Main {
	static int len, lim;
	static int[] arr, output;
	static StringBuilder sb = new StringBuilder();
	
	static void dfs(int depth, int pos) {
		if (depth==lim) {
			for (int i=0; i<lim; i++) {
				sb.append(output[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for (int idx=pos; idx<len; idx++) {
			output[depth] = arr[idx];
			dfs(depth+1, idx);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		len = Integer.parseInt(st.nextToken());
		lim = Integer.parseInt(st.nextToken());
		arr = new int[len];
		for (int i=0; i<len; i++) {
			arr[i] = i+1;
		}
		output = new int[lim];
		
		dfs(0, 0);
		System.out.println(sb);
		
		br.close();
	}
}
