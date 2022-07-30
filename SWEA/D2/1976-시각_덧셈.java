import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int test=0; test<T; test++) {
				int h1 = sc.nextInt();
				int m1 = sc.nextInt();
				int h2 = sc.nextInt();
				int m2 = sc.nextInt();
				
				int ansM = m1+m2;
				int ansH = h1+h2;
				
				if (ansM>=60) {
					ansM -= 60;
					ansH += 1;
				}
				
				if (ansH>12) {
					ansH -=12;
				}
				
				System.out.printf("#%d %d %d\n", test+1, ansH, ansM);
		}
		sc.close();
	}
}
