import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] rope = new int[N];
		for (int idx=0; idx<N; idx++) {
			 rope[idx] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(rope);
		
		int max = 0;
		for (int ite=0; ite<N; ite++) {
			if ((rope[ite]*(N-ite)) > max) {
				max = rope[ite]*(N-ite);
			}
		}

		System.out.println(max);
		
		br.close();
	}
}
