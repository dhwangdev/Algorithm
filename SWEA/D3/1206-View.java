import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int test=1; test<=10; test++) {
			int num = Integer.parseInt(br.readLine());
			
			int[] floor = new int[num];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int idx=0; idx<num; idx++) {
				floor[idx] = Integer.parseInt(st.nextToken());
			}
			
			int count = 0;
			for (int idx=0; idx<num-4; idx++) {
				int[] temp = {floor[idx], floor[idx+1], floor[idx+2], floor[idx+3], floor[idx+4]};
				
				int check = temp[2];
				Arrays.sort(temp);
				if (check == temp[4]) {
					count += (temp[4]-temp[3]);
				}
			}
			System.out.printf("#%d %d", test, count);
			System.out.println();
		}
		br.close();
	}
}
