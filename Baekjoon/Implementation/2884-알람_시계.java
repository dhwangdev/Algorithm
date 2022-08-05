import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int raw = H*60+M-45;
		
		if (raw<0) {
			raw += 24 * 60;
		}
		
		H = raw/60;
		M = raw%60;
		
		System.out.printf("%d %d", H, M);
	}
}
