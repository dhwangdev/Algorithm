import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int max = -1_000_001;
		int min = 1_000_001;
		
		while (st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			
			if (num<min) {
				min = num;
			}
			
			if (num>max) {
				max = num;
			}
		}
		
		br.close();
		
		System.out.printf("%d %d", min, max);
	}
}
