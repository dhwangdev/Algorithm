import java.util.*;
import java.io.*;

public class Main {
	static int len, lim;
	static int[] arr, res;
	static StringBuilder sb = new StringBuilder();
	
	static void dfs(int depth) {
		if (depth==lim) {
			for (int i=0; i<lim; i++) {
				sb.append(res[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for (int idx=0; idx<len; idx++) {
			res[depth] = arr[idx];
			dfs(depth+1);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		len = Integer.parseInt(st.nextToken());
		lim = Integer.parseInt(st.nextToken());
		arr = new int[len];
		for (int i=0; i<len; i++) {
			arr[i] = i+1;
		}
		res = new int[lim];
		
		dfs(0);
		System.out.println(sb);
		
		br.close();
	}
}
