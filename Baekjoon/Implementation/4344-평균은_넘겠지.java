import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for (int idx=0; idx<test; idx++) {
			st = new StringTokenizer(br.readLine());
			
			int num = Integer.parseInt(st.nextToken());
			
			int sum=0;
			int[] score = new int[num];
			for (int idx2=0; idx2<num; idx2++) {
				score[idx2] = Integer.parseInt(st.nextToken());
				sum += score[idx2];
			}
			
			double avg = (double) sum/num;
			int count = 0;
			
			for (int ele: score) {
				if (ele>avg) {
					count += 1;
				}
			}
			
			double percent = (double) count/num*100;
			
			System.out.printf("%.3f%%\n", percent);
		}
		br.close();
	}
}
