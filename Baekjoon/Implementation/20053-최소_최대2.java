import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int test=0; test<T; test++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int min = 1_000_001;
			int max = -1_000_001;
				
			for (int idx=0; idx<N; idx++) {
				int num = Integer.parseInt(st.nextToken());
				
				if (num>max) {
					max = num;
				}
				
				if (num<min) {
					min = num;
				}
			}
			
			System.out.printf("%d %d", min, max);
			System.out.println();
		}
		br.close();
	}
}
