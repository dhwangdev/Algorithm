import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int tc = Integer.parseInt(br.readLine());
		for (int T=1; T<=tc; T++) {
			int people = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int[] income = new int[people];
			int sum = 0;
			for (int idx=0; idx<people; idx++) {
				income[idx] = Integer.parseInt(st.nextToken());
				sum += income[idx];
			}
			double avg = (double) sum/people;
			int count = 0;
			for (int ele: income) {
				if (ele<= avg) count++;
			}
			
			System.out.printf("#%d %d\n", T, count);
			
		}
		br.close();
	}
}
