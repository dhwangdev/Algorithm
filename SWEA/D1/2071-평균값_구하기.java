import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int[] use = new int[10];
		for (int test=0; test<T; test+=1) {
			int sum = 0;
			for (int ite=0; ite<10; ite+=1) {
				int num = sc.nextInt();
				sum += num;
			}
			double avg = Math.round((double)sum/10);
			use[test] = (int) avg;
		}
		sc.close();
		
		for (int test=0; test<T; test+=1) {
			System.out.printf("#%d "+use[test], test+1);
			System.out.println();
		}
	}
}
