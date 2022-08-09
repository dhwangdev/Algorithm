import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] time = new int[N];
		for (int ite=0; ite<N; ite++) {
			time[ite] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(time);
		
		int sum = time[0];
		for (int idx=1; idx<N; idx++) {
			time[idx] += time[idx-1];
			sum += time[idx];
		}
		
		System.out.println(sum);
		
		br.close();
	}
}
