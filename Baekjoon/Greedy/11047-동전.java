import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] coin = new int[N];
		for (int idx=0; idx<N; idx++) {
			coin[idx] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;
		for (int idx2=N-1; idx2>=0; idx2--) {
			if (coin[idx2] > K) {
				continue;
			} else {
				count += K/coin[idx2];
				K %= coin[idx2];
			}
			
			if (K==0) {
				break;
			}
		}

		System.out.println(count);
		
		br.close();
	}
}
