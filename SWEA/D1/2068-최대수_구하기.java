import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int[] use = new int[T];
		for(int test=0; test<T; test++) {
			int max = 0;
			for(int idx=0; idx<10; idx++) {
				int num = sc.nextInt();
				max = Math.max(max, num);
			}
			use[test] = max;
		}
		sc.close();
		
		for(int test=0; test<T; test++) {
			System.out.printf("#%d ", test+1);
			System.out.println(use[test]);
		}
	}

}
