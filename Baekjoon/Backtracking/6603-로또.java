import java.util.*;
import java.io.*;

public class Main {
	static int len;
	static int[] arr, output;
	static StringBuilder sb = new StringBuilder();
	
	static void comb(int depth, int pos) {
		if (depth==6) {
			for (int num: output) {
				sb.append(num).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for (int idx=pos; idx<len; idx++) {
			output[depth] = arr[idx];
			comb(depth+1, idx+1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			len = Integer.parseInt(st.nextToken());
			if (len==0) break;
			arr = new int[len];
			for (int i=0; i<len; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			output = new int[6];
			
			comb(0, 0);
			sb.append("\n");
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
