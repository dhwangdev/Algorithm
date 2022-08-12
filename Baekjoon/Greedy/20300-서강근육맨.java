import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		long[] loss = new long[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int t=0; t<N; t++) {
			loss[t] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(loss);
		
		long M = 0;
		
		if (loss.length%2==0) {
			for (int idx=0; idx<loss.length/2; idx++) {
				if (M<loss[idx]+loss[loss.length-1-idx]) {
					M = loss[idx]+loss[loss.length-1-idx];
				}
			}
		} else {
			for (int idx=0; idx<(loss.length-1)/2; idx++) {
				if (M<loss[idx]+loss[loss.length-2-idx]) {
					M = loss[idx]+loss[loss.length-2-idx];
				}
			}
			if (M<loss[loss.length-1]) {
				M = loss[loss.length-1];
			}
		}
		
		System.out.println(M);
		
		br.close();
	}
}
