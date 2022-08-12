import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double sum = 0;
		double max = 0;
		long[] drink = new long[N];
		for (int idx=0; idx<N; idx++) {
			drink[idx] = Long.parseLong(st.nextToken());
			sum += drink[idx];
			if (max<drink[idx]) {
				max = drink[idx];
			}
		}
		
		System.out.println(sum/2 + max/2);
		
		br.close();
	}
}
