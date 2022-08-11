import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st1.nextToken());
		int M = Integer.parseInt(st1.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int[] card = new int[N];
		for (int ite=0; ite<N; ite++) {
			card[ite] = Integer.parseInt(st2.nextToken());
		}
		
		int maxSum = 0;
		for (int i=0; i<N-2; i++) {
			for (int j=i+1; j<N-1; j++) {
				for (int k=j+1; k<N; k++) {
					int sum = 0;
					sum += card[i] + card[j] + card[k];
					if (sum<=M && sum>maxSum) {
						maxSum = sum;
					}
				}
			}
		}
		System.out.println(maxSum);
		
		br.close();
	}
}
