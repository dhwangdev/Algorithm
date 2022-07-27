import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] use = new int[T];
		
		for (int idx=0; idx<T; idx++) {
			int sum = 0;
			int[] input = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
			for (int ele : input) {
				if (ele%2==1) {
					sum+=ele;
				}
			}
			use[idx] = sum;
		}
		br.close();
		
		for (int idx=0; idx<T; idx++) {
			System.out.printf("#%d "+ use[idx], idx+1);
			System.out.println();
		}
	}

}
